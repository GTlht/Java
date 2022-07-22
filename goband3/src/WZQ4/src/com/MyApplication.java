package WZQ4.src.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MyApplication extends Application {
	private static int width = 560;//棋盘的宽度
	private int height = 620;//棋盘的高度
	private int padding = 40;//棋盘中线与线之间的距离
	private int margin = 20;//棋盘中边线距离棋盘边的距离
	private int lineCount = 14;//棋牌中水平线和垂直线的个数
	private boolean isBlack = true;//落黑子还是白子判定变量，true代表黑子，false代表白子
	private Chess[] chesses = new Chess[lineCount * lineCount];//存储棋子对象的数组容器
	private int count = 0;//代表数组容器的索引，也代表棋盘上棋子的个数
	private int isWinCount1 = 1;//判断是否胜利的连续相同颜色棋子个数
	private int xIsWinCount = 1;
	private int xxIsWinCount = 1;
	private int isWinCount2=1;
	private boolean isWin = false;//判断是否胜利，false代表未胜利，true代表胜利
	private Pane pane=null;
	private Stage stage=null;
	private static boolean printFlag=false;
	private static List<String> list=new ArrayList<String>();
	private static String[] arr=new String[3];
	private int printCount=0;
	@Override
	public void start(Stage stage) throws Exception {
		this.stage=stage;
		//获取画板对象
		Pane pane = getPane();
		
		//创建场景对象，并将画板放到场景上
		Scene scene = new Scene(pane, width, height);
		
		//将场景设置到舞台上
		stage.setScene(scene);
		//点关闭后退出
		exit(stage);
		//展示大舞台
		stage.show();
	}

	public void exit(Stage stage) {
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				//创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);
				
				//设置提示内容
				alert.setTitle("退出");
				alert.setHeaderText("确定退出吗？");
				alert.setContentText("要不要再想想~~");
				
				//展示弹出框
				Optional<ButtonType> showAndWait = alert.showAndWait();
				if(showAndWait.get()==ButtonType.OK) {
					
				}else {
					event.consume();
				}
				
			}
		});
	}

	//获取画板对象
	public Pane getPane() {
		//创建画板对象
		this.pane = new Pane();
		
		//给画板设置颜色
		pane.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));
		
		
		if(printFlag) {//判断是否打谱
			print();//进行打谱操作的方法
		}else {
			//给画板绑定鼠标点击事件
			play();//下棋方法
		}
		
		
		//创建线条对象
		int increment = 0;
		for(int i = 0; i < lineCount; i++) {
			Line rowLine = new Line(margin, margin + increment, margin+(lineCount-1)*padding, margin + increment);
			Line colLine = new Line(margin + increment, margin, margin + increment,   margin+(lineCount-1)*padding);
			
			//将线条放到画板中
			pane.getChildren().add(rowLine);
			pane.getChildren().add(colLine);
			
			increment += padding;
		}
		
		
		getStartButton();//获取再来一局按钮
		getSeveButten();//获取保存棋谱按钮
		getPrintButton();//获取打谱按钮
		exitButton();//获取退出按钮
		getRegretButton();//获取悔棋按钮
		
		
		return pane;
	}

	public void getRegretButton() {
		Button regretButton=new Button("悔棋");
		regretButton.setPrefSize(2*padding, padding);
		regretButton.setLayoutX(21*margin);
		regretButton.setLayoutY(height-margin-padding);
		pane.getChildren().add(regretButton);
		regretButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(isWin) {
					return;
				}
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size()-1));
				count--;
				if(isBlack) {
					isBlack=false;
				}else {
					isBlack=true;
				}
				
			}
		});
	}

	private void exitButton() {
		Button exitButton=new Button("退出");
		exitButton.setPrefSize(2*padding, padding);
		exitButton.setLayoutX(16*margin);
		exitButton.setLayoutY(height-margin-padding);
		pane.getChildren().add(exitButton);
		exitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);
				if(isWin) {
					//设置提示内容
					alert.setTitle("退出");
					alert.setHeaderText("确定退出吗？");
					alert.setContentText("要不要再想想~~");
					
					//展示弹出框
					Optional<ButtonType> showAndWait = alert.showAndWait();
					if(showAndWait.get()==ButtonType.OK) {
						System.exit(0);
					}else {
						//event.consume();
					}
				}else {
					//设置提示内容
					alert.setTitle("退出");
					alert.setHeaderText("还未分出胜负,确定退出吗？");
					alert.setContentText("要不要再想想~~");
					//展示弹出框
					Optional<ButtonType> showAndWait = alert.showAndWait();
					if(showAndWait.get()==ButtonType.OK) {
						System.exit(0);
						//throw new RuntimeException("退出游戏");
					}else {
						//event.consume();
					}
					
				}
				
				
			}
		});
	}

	private void play() {
		pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				//胜利不可以落子
				if(isWin) {
					return;
				}
				
				//获取鼠标点击的位置的横纵坐标
				double x = event.getX();
				double y = event.getY();
				
				//判断超出棋盘边界不能落子
				if(!(x >= 20 && x <= 540 && y >= 20 && y <= 540)) {
					return;
				}
				
				//占横纵格子的数
				int _x = ((int)x - margin + padding/2)/padding;
				int _y = ((int)y - margin + padding/2)/padding;
				
				//判断落子位置上是否存在棋子
				if(isHas(_x, _y)) {
					return;
				}
				
				//创建圆圈对象
				Circle circle = null;
				//创建棋子对象
				Chess chess = null;
				
				//判断落黑子还是白子
				if(isBlack) {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 10, Color.BLACK);
					chess = new Chess(_x, _y, Color.BLACK);
					//System.out.println(chess.toString());
					//修改判定条件
					isBlack = false;
				} else {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 10, Color.WHITE);
					chess = new Chess(_x, _y, Color.WHITE);
					//修改判定条件
					isBlack = true;
				}
				
				//将圆圈对象放到画板上
				pane.getChildren().add(circle);
				//将棋子对象存储到容器中
				chesses[count] = chess;
				count++;
				
				//判断是否胜利
				if(isWin(chess)) {
					isWin = true;
					
					//创建弹出框对象
					Alert alert = new Alert(AlertType.INFORMATION);
					
					//设置提示内容
					alert.setTitle("胜利");
					alert.setHeaderText("您胜利啦，好棒哦~");
					alert.setContentText("...");
					
					//展示弹出框
					alert.showAndWait();
				}
			}
		});
	}
	public void print() {
		//下一步
		Button nextButton=new Button("下一步");
		nextButton.setPrefSize(2*padding, padding);
		nextButton.setLayoutX(2*margin+padding*(lineCount-1));
		nextButton.setLayoutY(margin);
		pane.getChildren().add(nextButton);
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(printCount>=list.size()) {
					return;
				}
				arr=list.get(printCount).split(",");
				Circle circle = new Circle(Integer.parseInt(arr[0])* padding + margin, Integer.parseInt(arr[1])* padding + margin, 10,Color.valueOf(arr[2]));
			    pane.getChildren().add(circle);
			   // System.out.println(pane.getChildren().get(pane.getChildren().size()-1));
			    printCount++;
				
			}
		});
		//上一步
		Button backButton=new Button("上一步");
		backButton.setPrefSize(2*padding, padding);
		backButton.setLayoutX(2*margin+padding*(lineCount-1));
		backButton.setLayoutY(4*margin);
		pane.getChildren().add(backButton);
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(printCount<=0) {
					return;
				}
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size()-1));
				printCount--;
				
			}
		});
		//退出复盘
		Button exitPrintButton=new Button("退出复盘");
		exitPrintButton.setPrefSize(2*padding, padding);
		exitPrintButton.setLayoutX(2*margin+padding*(lineCount-1));
		exitPrintButton.setLayoutY(7*margin);
		pane.getChildren().add(exitPrintButton);
		exitPrintButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);
				
				//设置提示内容
				alert.setTitle("退出");
				alert.setHeaderText("确定退出复盘吗？");
				alert.setContentText("要不要再想想~~");
				
				//展示弹出框
				Optional<ButtonType> showAndWait = alert.showAndWait();
				if(showAndWait.get()==ButtonType.OK) {
					printFlag=false;
					width=560;
					MyApplication app=new MyApplication();
					 try {
						app.start(stage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					
				}
				
				
			}
		});
	}

	private void getPrintButton() {
		Button printButton=new Button("打印棋谱");
		printButton.setPrefSize(2*padding, padding);
		printButton.setLayoutX(11*margin);
		printButton.setLayoutY(height-margin-padding);
		pane.getChildren().add(printButton);
		printButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				width=700;
				printFlag=true;
				FileChooser fileChooser=new FileChooser();
				File file = fileChooser.showOpenDialog(stage);
				String line=null;
				BufferedReader br=null;
				if(file==null) {
					return;
				}
				try {
					br = new BufferedReader(new FileReader(file));
					try {
						while((line=br.readLine())!=null) {
							list.add(line);
//						
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}finally {
					if(br!=null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				
				
				MyApplication app=new MyApplication();
				 try {
					app.start(stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}

	private void getSeveButten() {
		Button seveButton=new Button("保存棋谱");
		seveButton.setPrefSize(2*padding, padding);
		seveButton.setLayoutX(6*margin);
		seveButton.setLayoutY(height-margin-padding);
		pane.getChildren().add(seveButton);
		seveButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(!isWin) {
					return;
				}
				FileChooser fileChooser=new FileChooser();
				File file = fileChooser.showSaveDialog(stage);
				
				BufferedWriter bw=null;
				if(file==null) {
					return;
				}
				try {
					bw = new BufferedWriter(new FileWriter(file));
					//System.out.println(bw+"ass");
					for (int i=0;i<count;i++) {
						bw.write(chesses[i].toString());
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					if(bw!=null) {
						try {
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				}
				
				
			}
		});
		
	}

	private void getStartButton() {
		Button startButton=new Button("再来一局");
		startButton.setPrefSize(2*padding, padding);
		startButton.setLayoutX(margin);
		startButton.setLayoutY(height-margin-padding);
		pane.getChildren().add(startButton);
		startButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(!isWin) {
					return;
				}
				//删除棋子
				pane.getChildren().removeIf(new Predicate<Object>() {
					@Override
					public boolean test(Object t) {
						return t instanceof Circle;
					}
				});
				isWin=false;
				isBlack=true;
				chesses = new Chess[lineCount * lineCount];
				count=0;
			}
		});
	}
	
	/**
	 * 判断指定坐标处是否有棋子存在
	 * @param x 横坐标
	 * @param y 纵坐标
	 * @return 棋子是否存在，存在返回true，不存在返回false
	 */
	public boolean isHas(int x, int y) {
		//遍历容器
		for(int i = 0; i < count; i++) {
			Chess chess = chesses[i];
			if(chess.getX() == x && chess.getY() == y) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 判断是否胜利
	 * @param chess 落子的棋子对象(横坐标，纵坐标，棋子颜色)
	 * @return 是否胜利，胜利返回true，未胜利返回false
	 */
	public boolean isWin(Chess chess) {
		//获取棋子的横坐标和纵坐标
		int x = chess.getX();
		int y = chess.getY();
		
		//水平方向
		//向右
		for(int i = x+1; i <= x+4 && i <= 13; i++) {
			//获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(i, y);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				isWinCount1++;
			} else {
				break;
			}
		}
		
		//向左
		for(int i = x-1; i >= x - 4 && i >= 0; i--) {
			//获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(i, y);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				isWinCount1++;
			} else {
				break;
			}
		}
		//垂直方向
		//向上
		for(int i = y+1; i <= y+4 && i <= 13; i++) {
			//获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(x, i);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				isWinCount2++;
			} else {
				break;
			}
		}
		
		//向下
		for(int i = y-1; i >= y - 4 && i >= 0; i--) {
			//获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(x, i);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				isWinCount2++;
			} else {
				break;
			}
		}
		int a = y+1;
		int b=x+1;
	//	System.out.println(a);
		
		while(a <=y + 4 && a <=13&&b<=x+4&&b<=13) {
			Chess _chess = getChess(b, a);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				
				xIsWinCount++;
				//System.out.println("laiguo");
			} else {
			
				break;
			}
			a++;
			b++;
		}
		int i = y-1;
		int j=x-1;
		while(i >=y-4 && i >=0&&j>=x-4&&j>=0) {
			
			Chess _chess = getChess(j, i);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				xIsWinCount++;
				
			} else {
				
				break;
			}
			i--;
			j--;
		}
		int a1 = y+1;
		int b1=x-1;
		while(a1<=y+4 && a1<=13&&b1>=x-4&&b1>=0) {
			
			Chess _chess = getChess(b1, a1);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				xxIsWinCount++;
				
			} else {
				
				break;
			}
			a1++;
			b1--;
		}

		int a2 = y-1;
		int b2=x+1;
		while(a2>=y-4 && a2>=0&&b2<=x+4&&b2<=13) {
			
			Chess _chess = getChess(b2, a2);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				xxIsWinCount++;
				
			} else {
				
				break;
			}
			a2--;
			b2++;
		}
		
		//判断是否胜利
		if(isWinCount1 >= 5) {
			isWinCount1 = 1;
			return true;
		}
		
		isWinCount1 = 1;
		if(isWinCount2 >= 5) {
			isWinCount2 = 1;
			return true;
		}
		
		isWinCount2 = 1;
		
		if(xIsWinCount >= 5) {
			xIsWinCount = 1;
			return true;
		}
		xIsWinCount = 1;
		if(xxIsWinCount >= 5) {
			xxIsWinCount = 1;
			return true;
		}
		xxIsWinCount = 1;
		
		//垂直方向
		
		//正斜线方向
		
		//反斜线方向
		
		//未胜利
		return false;
	}
	
	/**
	 * 获取指定坐标处的棋子对象
	 * @param x 指定的横坐标
	 * @param y 指定的纵坐标
	 * @return 指定坐标处的棋子对象
	 */
	public Chess getChess(int x, int y) {
		//遍历容器
		for(int i = 0; i < count; i++) {
			Chess chess = chesses[i];
			if(chess.getX() == x && chess.getY() == y) {
				//找到了
				return chess;
			}
		}
		
		//没找到
		return null;
	}
	
	public static void main(String[] args) {
		//启动
		launch(args);
	}
}
