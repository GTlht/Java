package ui.web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import dataMessage.ChessMessage;
import dataMessage.Global;

import javafx.application.Platform;
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
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import pojo.Chess;

public class WebUi extends Stage {
//	static {
//		try {
//			//music();
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	}
	private static int width = 560;// 棋盘的宽度
	private int height = 620;// 棋盘的高度
	private int padding = 40;// 棋盘中线与线之间的距离
	private int margin = 20;// 棋盘中边线距离棋盘边的距离
	private int lineCount = 14;// 棋牌中水平线和垂直线的个数
	private boolean isBlack = true;// 落黑子还是白子判定变量，true代表黑子，false代表白子
	private Chess[] chesses = new Chess[lineCount * lineCount];// 存储棋子对象的数组容器
	private int count = 0;// 代表数组容器的索引，也代表棋盘上棋子的个数
	private boolean isWin = false;// 判断是否胜利，false代表未胜利，true代表胜利
	private Pane pane = null;
	private Stage stage = null;
	private static boolean printFlag = false;// 判断是否打印棋谱
	private static List<String> list = new ArrayList<String>();// 保存棋子
	private static String[] arr = new String[3];
	private int printCount = 0;
	private boolean isPlay=true;
	
	
	public  WebUi()  {
		this.stage = this;
		
		
//		ImageView nieview = new ImageView();
//		//显示图片需要set
//		nieview.setImage(nie);
		
		// 获取画板对象
		Pane pane = getPane();
		// 创建场景对象，并将画板放到场景上
		Scene scene = new Scene(pane, width, height);
		// 将场景设置到舞台上
		stage.setScene(scene);
		// 点关闭后退出
		exit(stage);
		
	}

	// 获取画板对象
	public Pane getPane()  {
		// 创建画板对象
		this.pane = new Pane();
		// 给画板设置颜色
		pane.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, null, null)));
		// pane.setBackground(nie);
		if (printFlag) {// 判断是否打谱
			print();// 进行打谱操作的方法
		} else {
			play();// 下棋方法
		}

		// 创建线条对象
		createLine();
		// 获取再来一局按钮
		getStartButton();
		// 获取保存棋谱按钮
		getSeveButten();
		// 获取打谱按钮
		getPrintButton();
		// 获取退出按钮
		exitButton();
		// 获取悔棋按钮
		getRegretButton();
//		Image nie = new Image("1.jpg");
//		pane.getChildren().add(new ImagePattern(nie));
		return pane;
	}

	public static void music() throws MalformedURLException {
		// 打开歌曲文件，此时采用相对路径，即本工程目录下
		File file1 = new File("Vanotek _ Eneli - Back To Me.mp3");
		URI uri1 = file1.toURI(); // 先转成URI
		URL url1 = uri1.toURL(); // 再转为URL
		String Mp3play1 = url1.toString(); // 将URL转换为字符串
		// Media为了表示一个文件，MediaPlayer则为了将这个文件播放
		AudioClip ac=new AudioClip(Mp3play1);
		//Media media1 = new Media(Mp3play1); // 新建一个Media，使它与得到的URL相关
	//	MediaPlayer mp3 = new MediaPlayer(media1); // 将media1传与新建的MediaPlayer
		// 然后播放
		//media1.se
		ac.setBalance(-1);
		ac.setVolume(0.1);
		ac.play();
	}

	public void createLine() {
		int increment = 0;
		for (int i = 0; i < lineCount; i++) {
			Line rowLine = new Line(margin, margin + increment, margin + (lineCount - 1) * padding, margin + increment);
			Line colLine = new Line(margin + increment, margin, margin + increment, margin + (lineCount - 1) * padding);

			// 将线条放到画板中
			pane.getChildren().add(rowLine);
			pane.getChildren().add(colLine);

			increment += padding;
		}
	}

	public void exit(Stage stage) {
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				// 创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);

				// 设置提示内容
				alert.setTitle("退出");
				alert.setHeaderText("确定退出吗？");
				alert.setContentText("要不要再想想~~");

				// 展示弹出框
				Optional<ButtonType> showAndWait = alert.showAndWait();
				if (showAndWait.get() == ButtonType.OK) {

				} else {
					event.consume();
				}

			}
		});
	}
	//悔棋
	public void getRegretButton() {
		Button regretButton = new Button("悔棋");
		regretButton.setPrefSize(2 * padding, padding);
		regretButton.setLayoutX(21 * margin);
		regretButton.setLayoutY(height - margin - padding);
		pane.getChildren().add(regretButton);
		regretButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (isWin) {
					return;
				}
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size() - 1));
				count--;
				if (isBlack) {
					isBlack = false;
				} else {
					isBlack = true;
				}

			}
		});
	}

	private void exitButton() {
		Button exitButton = new Button("退出");
		exitButton.setPrefSize(2 * padding, padding);
		exitButton.setLayoutX(16 * margin);
		exitButton.setLayoutY(height - margin - padding);
		pane.getChildren().add(exitButton);
		exitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// 创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);
				if (isWin) {
					// 设置提示内容
					alert.setTitle("退出");
					alert.setHeaderText("确定退出吗？");
					alert.setContentText("要不要再想想~~");

					// 展示弹出框
					Optional<ButtonType> showAndWait = alert.showAndWait();
					if (showAndWait.get() == ButtonType.OK) {
						System.exit(0);
					} else {
						// event.consume();
					}
				} else {
					// 设置提示内容
					alert.setTitle("退出");
					alert.setHeaderText("还未分出胜负,确定退出吗？");
					alert.setContentText("要不要再想想~~");
					// 展示弹出框
					Optional<ButtonType> showAndWait = alert.showAndWait();
					if (showAndWait.get() == ButtonType.OK) {
						System.exit(0);
						// throw new RuntimeException("退出游戏");
					} else {
						// event.consume();
					}

				}

			}
		});
	}

	private void play() {
		// 给画板绑定鼠标点击事件
		pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// 胜利不可以落子
				if (isWin||!isPlay) {
					return;
				}
				// 获取鼠标点击的位置的横纵坐标
				double x = event.getX();
				double y = event.getY();
				// 判断超出棋盘边界不能落子
				if (!(x >= 20 && x <= 540 && y >= 20 && y <= 540)) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
			        alert.setTitle("警告");
			        alert.setContentText("棋子不可以下在此处！");
			        alert.showAndWait();
	
					return;
				}
				// 占横纵格子的数
				int _x = ((int) x - margin + padding / 2) / padding;
				int _y = ((int) y - margin + padding / 2) / padding;
				// 判断落子位置上是否存在棋子
				if (isHas(_x, _y)) {
					return;
				}
				// 创建圆圈对象
				Circle circle = null;
				// 创建棋子对象
				Chess chess = null;
				// 判断落黑子还是白子
				if (isBlack) {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 18, Color.BLACK);
					chess = new Chess(_x, _y, Color.BLACK);
					// 修改判定条件
					isBlack = false;
				} else {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 18, Color.WHITE);
					chess = new Chess(_x, _y, Color.WHITE);
					// 修改判定条件
					isBlack = true;
				}
				isPlay=false;
				// 将圆圈对象放到画板上
				pane.getChildren().add(circle);
				//发送
				try {
					Socket s=new Socket(Global.oip,Global.oport);
					ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
					oos.writeObject(new ChessMessage(_x, _y, !isBlack));
					oos.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// 将棋子对象存储到容器中
				chesses[count] = chess;
				count++;

				// 判断是否胜利
				if (isWin(chess)) {
					isWin = true;
					// 创建弹出框对象
					Alert alert = new Alert(AlertType.INFORMATION);

					// 设置提示内容
					alert.setTitle("胜利");
					alert.setHeaderText("您胜利啦，好棒哦~");
					alert.setContentText("...");
					alert.initOwner(WebUi.this);
					// 展示弹出框
					alert.showAndWait();
				}
			}
		});
	}

	public void print() {
		// 下一步
		Button nextButton = new Button("下一步");
		nextButton.setPrefSize(2 * padding, padding);
		nextButton.setLayoutX(2 * margin + padding * (lineCount - 1));
		nextButton.setLayoutY(margin);
		pane.getChildren().add(nextButton);
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (printCount >= list.size()) {
					return;
				}
				arr = list.get(printCount).split(",");
				Circle circle = new Circle(Integer.parseInt(arr[0]) * padding + margin,
						Integer.parseInt(arr[1]) * padding + margin, 10, Color.valueOf(arr[2]));
				pane.getChildren().add(circle);
				// System.out.println(pane.getChildren().get(pane.getChildren().size()-1));
				printCount++;

			}
		});
		// 上一步
		Button backButton = new Button("上一步");
		backButton.setPrefSize(2 * padding, padding);
		backButton.setLayoutX(2 * margin + padding * (lineCount - 1));
		backButton.setLayoutY(4 * margin);
		pane.getChildren().add(backButton);
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (printCount <= 0) {
					return;
				}
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size() - 1));
				printCount--;

			}
		});
		// 退出复盘
		Button exitPrintButton = new Button("退出复盘");
		exitPrintButton.setPrefSize(2 * padding, padding);
		exitPrintButton.setLayoutX(2 * margin + padding * (lineCount - 1));
		exitPrintButton.setLayoutY(7 * margin);
		pane.getChildren().add(exitPrintButton);
		exitPrintButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// 创建弹出框对象
				Alert alert = new Alert(AlertType.CONFIRMATION);

				// 设置提示内容
				alert.setTitle("退出");
				alert.setHeaderText("确定退出复盘吗？");
				alert.setContentText("要不要再想想~~");

				// 展示弹出框
				Optional<ButtonType> showAndWait = alert.showAndWait();
				if (showAndWait.get() == ButtonType.OK) {
					printFlag = false;
					width = 560;
					try {
						WebUi app = new WebUi();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						//app.start(stage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {

				}

			}
		});
	}

	private void getPrintButton() {
		Button printButton = new Button("打印棋谱");
		printButton.setPrefSize(2 * padding, padding);
		printButton.setLayoutX(11 * margin);
		printButton.setLayoutY(height - margin - padding);
		pane.getChildren().add(printButton);
		printButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				width = 660;
				printFlag = true;
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(stage);
				String line = null;
				BufferedReader br = null;
				if (file == null) {
					return;
				}
				try {
					br = new BufferedReader(new FileReader(file));
					try {
						while ((line = br.readLine()) != null) {
							list.add(line);
							//
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				
					try {
						WebUi app = new WebUi();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
//				try {
//					//app.start(stage);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

			}
		});
	}

	private void getSeveButten() {
		Button seveButton = new Button("保存棋谱");
		seveButton.setPrefSize(2 * padding, padding);
		seveButton.setLayoutX(6 * margin);
		seveButton.setLayoutY(height - margin - padding);
		pane.getChildren().add(seveButton);
		seveButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (!isWin) {
					return;
				}
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showSaveDialog(stage);

				BufferedWriter bw = null;
				if (file == null) {
					return;
				}
				try {
					bw = new BufferedWriter(new FileWriter(file));
					// System.out.println(bw+"ass");
					for (int i = 0; i < count; i++) {
						bw.write(chesses[i].toString());
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (bw != null) {
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
	//再来一局
	private void getStartButton() {
		Button startButton = new Button("再来一局");
		startButton.setPrefSize(2 * padding, padding);
		startButton.setLayoutX(margin);
		startButton.setLayoutY(height - margin - padding);
		pane.getChildren().add(startButton);
		startButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (!isWin) {
					return;
				}
				// 删除棋子
				pane.getChildren().removeIf(new Predicate<Object>() {
					@Override
					public boolean test(Object t) {
						return t instanceof Circle;
					}
				});
				isWin = false;
				isBlack = true;
				chesses = new Chess[lineCount * lineCount];
				count = 0;
			}
		});
	}

	/**
	 * 判断指定坐标处是否有棋子存在
	 * 
	 * @param x
	 *            横坐标
	 * @param y
	 *            纵坐标
	 * @return 棋子是否存在，存在返回true，不存在返回false
	 */
	public boolean isHas(int x, int y) {
		// 遍历容器
		for (int i = 0; i < count; i++) {
			Chess chess = chesses[i];
			if (chess.getX() == x && chess.getY() == y) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 判断是否胜利
	 * 
	 * @param chess
	 *            落子的棋子对象(横坐标，纵坐标，棋子颜色)
	 * @return 是否胜利，胜利返回true，未胜利返回false
	 */
	public boolean isWin(Chess chess) {
		// 获取棋子的横坐标和纵坐标
		int x = chess.getX();
		int y = chess.getY();
		// 水平方向
		int levelCount=level(chess, x, y);
		// 垂直方向
		int verticalCount=vertical(chess, x, y);
		//左斜线方向
		int leftObliqueCount=leftOblique(chess, x, y);
		//右斜线方向
		int rightObliqueCount=rightOblique(chess, x, y);

		// 判断是否胜利
		if (levelCount >= 5||verticalCount >= 5||leftObliqueCount >= 5||rightObliqueCount >= 5) {
			return true;
		}

		return false;
	}

	public int rightOblique(Chess chess, int x, int y) {
		int count=1;
		int i = x - 1;
		int j = y + 1;
		while (j <= y + 4 && j <= 13 && i >= x - 4 && i >= 0) {
			Chess _chess = getChess(i, j);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
			i--;
			j++;
		}
		i = x + 1;
		j = y - 1;
		while (j>= y - 4 && j >= 0 && i <= x + 4 && i <= 13) {
			Chess _chess = getChess(i, j);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
			i++;
			j--;
		}
		return count;
	}

	public int leftOblique(Chess chess, int x, int y) {
		int count=1;
		int i = x + 1;
		int j = y + 1;
		while (j <= y + 4 && j <= 13 && i <= x + 4 && i <= 13) {
			Chess _chess = getChess(i, j);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1

				count++;
				// System.out.println("laiguo");
			} else {

				break;
			}
			j++;
			i++;
		}
		i = y - 1;
		j = x - 1;
		while (i >= y - 4 && i >= 0 && j >= x - 4 && j >= 0) {

			Chess _chess = getChess(j, i);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;

			} else {

				break;
			}
			i--;
			j--;
		}
		return count;
	}

	public int vertical(Chess chess, int x, int y) {
		int count=1;
		// 向上
		for (int i = y + 1; i <= y + 4 && i <= 13; i++) {
			// 获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(x, i);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
		}
		// 向下
		for (int i = y - 1; i >= y - 4 && i >= 0; i--) {
			// 获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(x, i);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public int level(Chess chess, int x, int y) {
		int count=1;
		for (int i = x + 1; i <= x + 4 && i <= 13; i++) {
			// 获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(i, y);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
		}
		// 向左
		for (int i = x - 1; i >= x - 4 && i >= 0; i--) {
			// 获取(i,y)坐标处的棋子对象
			Chess _chess = getChess(i, y);
			// 判断是否有棋子并且颜色是否一致
			if (_chess != null && _chess.getColor().equals(chess.getColor())) {
				// 计数+1
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	/**
	 * 获取指定坐标处的棋子对象
	 * 
	 * @param x
	 *            指定的横坐标
	 * @param y
	 *            指定的纵坐标
	 * @return 指定坐标处的棋子对象
	 */
	public Chess getChess(int x, int y) {
		// 遍历容器
		for (int i = 0; i < count; i++) {
			Chess chess = chesses[i];
			if (chess.getX() == x && chess.getY() == y) {
				// 找到了
				return chess;
			}
		}
		// 没找到
		return null;
	}

	public  void updata(ChessMessage m) {
		isPlay=true;
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				// 占横纵格子的数
				int _x = m.getX();
				int _y = m.getY();
				// 创建圆圈对象
				Circle circle = null;
				// 创建棋子对象
				Chess chess = null;
				// 判断落黑子还是白子
				if (m.isBlack()) {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 18, Color.BLACK);
					chess = new Chess(_x, _y, Color.BLACK);
					// 修改判定条件
					isBlack = false;
					
				} else {
					circle = new Circle(_x * padding + margin, _y * padding + margin, 18, Color.WHITE);
					chess = new Chess(_x, _y, Color.WHITE);
					// 修改判定条件
					isBlack = true;
					
				}

				// 将圆圈对象放到画板上
				pane.getChildren().add(circle);
				// 将棋子对象存储到容器中
				chesses[count] = chess;
				count++;

				// 判断是否胜利
				if (isWin(chess)) {
					isWin = true;
					// 创建弹出框对象
					Alert alert = new Alert(AlertType.INFORMATION);

					// 设置提示内容
					alert.setTitle("胜利");
					alert.setHeaderText("您胜利啦，好棒哦~");
					alert.setContentText("...");
					alert.initOwner(WebUi.this);

					// 展示弹出框
					alert.showAndWait();
				}
				
		}
		});
	}

	
}
