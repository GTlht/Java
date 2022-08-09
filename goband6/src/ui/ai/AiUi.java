package ui.ai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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

public class AiUi extends Stage {
	private static int width = 880;// 棋盘的宽度
	private int height = 700;// 棋盘的高度
	private int padding = 40;// 棋盘中线与线之间的距离
	private int margin = 20;// 棋盘中边线距离棋盘边的距离
	private int lineCount = 16;// 棋牌中水平线和垂直线的个数
	private boolean isBlack = false;// 落黑子还是白子判定变量，true代表黑子，false代表白子
	private Chess[] chesses = new Chess[(lineCount-1) * (lineCount-1)];// 存储棋子对象的数组容器
	private int count = 0;// 代表数组容器的索引，也代表棋盘上棋子的个数
	private boolean isWin = false;// 判断是否胜利，false代表未胜利，true代表胜利
	private Pane pane = null;
	private Stage stage = null;
	private static boolean printFlag = false;// 判断是否打印棋谱
	private static List<String> list = new ArrayList<String>();// 打印棋谱时保存棋子
	private static String[] arr = new String[3];
	private int printCount = 0;
	private int[][] warr=new int[lineCount][lineCount];//棋盘数组权值
	private Circle circle = null;// 圆圈对象
	private Chess chess = null;// 棋子对象
	private int bgCount=0;
	private int mcCount=1;
	private AudioClip ac;
	public AiUi()  {
		this.stage = this;
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
	public Pane getPane() {
		// 创建画板对象
		this.pane = new Pane();
		// 给画板设置颜色
		pane.setId("pane1");
		pane.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		//pane.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, null, null)));
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
		//切换背景
		getCutBg() ;
		//音乐
		music();
		return pane;
	}
	public void audio(String url) {
		File file1 = new File(url);
		URI uri1 = file1.toURI(); // 先转成URI
		URL url1;
		try {
			url1 = uri1.toURL();
			String Mp3play1 = url1.toString(); // 将URL转换为字符串
			AudioClip ac = new AudioClip(Mp3play1);
			ac.setBalance(0);
			ac.setVolume(1);
			ac.play();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 再转为URL
	}
	public  void music()  {
		File file1 = new File(mcCount+".mp3");
		URI uri1 = file1.toURI(); // 先转成URI
		URL url1;
		try {
			url1 = uri1.toURL();
			String Mp3play1 = url1.toString(); // 将URL转换为字符串
			 ac = new AudioClip(Mp3play1);
			ac.setBalance(0);
			ac.setVolume(0.5);
//			ac.play();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Button playMusic = new Button("播放音乐");
		playMusic.setPrefSize(2 * padding+margin, padding);
		playMusic.setLayoutX(1 * padding + padding * (lineCount - 1));
		playMusic.setLayoutY(15 * margin);
		playMusic.setId("button");
		playMusic.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(playMusic);
		playMusic.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				ac.stop();
				ac.play();
				
			}
		});
		Button stopMusic = new Button("停止音乐");
		stopMusic.setPrefSize(2 * padding+margin, padding);
		stopMusic.setLayoutX(4 * padding + padding * (lineCount - 1));
		stopMusic.setLayoutY(15 * margin);
		stopMusic.setId("button");
		stopMusic.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(stopMusic);
		stopMusic.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				ac.stop();
				//System.out.println(ac);
				
			}
		});
		Button nextMusic = new Button("下一曲");
		nextMusic.setPrefSize(2 * padding+margin, padding);
		nextMusic.setLayoutX(2.5* padding + padding * (lineCount - 1));
		nextMusic.setLayoutY(18 * margin);
		nextMusic.setId("button");
		nextMusic.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(nextMusic);
		nextMusic.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				mcCount++;
				if(mcCount==6)
					mcCount=1;
				File file1 = new File(mcCount+".mp3");
				URI uri1 = file1.toURI(); // 先转成URI
				URL url1;
			try {
					url1 = uri1.toURL();
					String Mp3play1 = url1.toString(); // 将URL转换为字符串
					if(ac!=null)
					ac.stop();
					ac = new AudioClip(Mp3play1);
					ac.setBalance(0);
					ac.setVolume(0.5);
					ac.play();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
	}
	public void getCutBg() {
		Button cutBg = new Button("切换背景");
		cutBg.setPrefSize(2 * padding+5, padding);
		cutBg.setLayoutX(25.5 * margin);
		cutBg.setLayoutY(height - margin - padding);
		cutBg.setId("button");
		cutBg.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		cutBg.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				bgCount++;
				if(bgCount==8)
					bgCount=0;
				pane.setId("pane"+bgCount);
				pane.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
				
			}
		});
		pane.getChildren().add(cutBg);
	}
	//画线条
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

	// 悔棋
	public void getRegretButton() {
		Button regretButton = new Button("悔棋");
		regretButton.setPrefSize(2 * padding+5, padding);
		regretButton.setLayoutX(20.5 * margin);
		regretButton.setLayoutY(height - margin - padding);
		regretButton.setId("button");
		regretButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(regretButton);
		regretButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (isWin||count<=0) {
					return;
				}
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size() - 1));
				count--;
				pane.getChildren().remove(pane.getChildren().get(pane.getChildren().size() - 1));
				count--;
//				if (isBlack) {
//					isBlack = false;
//				} else {
//					isBlack = true;
//				}

			}
		});
	}

	private void exitButton() {
		Button exitButton = new Button("退出");
		exitButton.setPrefSize(2 * padding+5, padding);
		exitButton.setLayoutX(15.5 * margin);
		exitButton.setLayoutY(height - margin - padding);
		exitButton.setId("button");
		exitButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
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
				if (isWin) {
					return;
				}
				// 获取鼠标点击的位置的横纵坐标
				double x = event.getX();
				double y = event.getY();
				// 判断超出棋盘边界不能落子
				if(!isLegal(x, y)) {
					return;
				}
				//人类落子
				humanPlay(x, y);
				if (isWin) {
					return;
				}
				//电脑落子
				pcPlay();
					
				if (isWin) {
					return;
				}
			}
		});
		
	}
	public void humanPlay(double x, double y) {
		// 占横纵格子的数
		int _x = ((int) x - margin + padding / 2) / padding;
		int _y = ((int) y - margin + padding / 2) / padding;
		// 判断落子位置上是否存在棋子
		if (isHas(_x, _y)) {
			return;
		}
		circle = new Circle(_x * padding + margin, _y * padding + margin, 18, Color.WHITE);
		chess = new Chess(_x, _y, Color.WHITE);
		audio("drop_chess_effect.mp3");
		// 将圆圈对象放到画板上
		pane.getChildren().add(circle);
		// 将棋子对象存储到容器中
		chesses[count] = chess;
		count++;
		concluate(warr);

		// 判断是否胜利
		if (isWin(chess)) {
			isWin = true;
			// 创建弹出框对象
			Alert alert = new Alert(AlertType.INFORMATION);
			// 设置提示内容
			alert.setTitle("胜利");
			alert.setHeaderText("您胜利啦，好棒哦~");
			alert.setContentText("...");

			// 展示弹出框
			alert.showAndWait();
		}
	}
	public boolean isLegal(double x, double y) {
		if (!(x >= margin && x <= margin+padding*(lineCount-1) && y >= margin && y <= margin+padding*(lineCount-1))) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("警告");
			alert.setContentText("棋子不可以下在此处！");
			alert.showAndWait();

			return false;
		}
		return true;
	}
	public void print() {
		// 下一步
		Button nextButton = new Button("下一步");
		nextButton.setPrefSize(2 * padding+margin,padding);
		nextButton.setLayoutX(2*padding + padding * (lineCount - 1));
		nextButton.setLayoutY(margin);
		nextButton.setId("button");
		nextButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(nextButton);
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (printCount >= list.size()) {
					return;
				}
				arr = list.get(printCount).split(",");
				Circle circle = new Circle(Integer.parseInt(arr[0]) * padding + margin,
						Integer.parseInt(arr[1]) * padding + margin, 18, Color.valueOf(arr[2]));
				pane.getChildren().add(circle);
				// System.out.println(pane.getChildren().get(pane.getChildren().size()-1));
				printCount++;

			}
		});
		// 上一步
		Button backButton = new Button("上一步");
		backButton.setPrefSize(2 * padding+margin, padding);
		backButton.setLayoutX(2 * padding + padding * (lineCount - 1));
		backButton.setLayoutY(5 * margin);
		backButton.setId("button");
		backButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
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
		exitPrintButton.setPrefSize(2 * padding+margin, padding);
		exitPrintButton.setLayoutX(2 * padding + padding * (lineCount - 1));
		exitPrintButton.setLayoutY(9 * margin);
		exitPrintButton.setId("button");
		exitPrintButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
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
					width = 600;
						AiUi app = new AiUi();
						app.show();
						ac.stop();
						AiUi.this.close();
			}
			}
		});
	}

	private void getPrintButton() {
		Button printButton = new Button("打印棋谱");
		printButton.setPrefSize(2 * padding+5, padding);
		printButton.setLayoutX(10.5 * margin);
		printButton.setLayoutY(height - margin - padding);
		printButton.setId("button");
		printButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		pane.getChildren().add(printButton);
		printButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//width = 700;
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
					AiUi app = new AiUi();
					app.show();
					ac.stop();
					AiUi.this.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void getSeveButten() {
		Button seveButton = new Button("保存棋谱");
		seveButton.setPrefSize(2 * padding+5, padding);
		seveButton.setLayoutX(5.5 * margin);
		seveButton.setLayoutY(height - margin - padding);
		seveButton.setId("button");
		seveButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
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

	// 再来一局
	private void getStartButton() {
		Button startButton = new Button("再来一局");
		startButton.setPrefSize(2 * padding+5, padding);//40
		startButton.setLayoutX(0.5*margin);
		startButton.setLayoutY(height - margin - padding);
		startButton.setId("button");
		startButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
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
			if (chess.getX() == x && chess.getY() == y ) {
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
		int levelCount = level(chess, x, y);
		// 垂直方向
		int verticalCount = vertical(chess, x, y);
		// 左斜线方向
		int leftObliqueCount = leftOblique(chess, x, y);
		// 右斜线方向
		int rightObliqueCount = rightOblique(chess, x, y);

		// 判断是否胜利
		if (levelCount >= 5 || verticalCount >= 5 || leftObliqueCount >= 5 || rightObliqueCount >= 5) {
			return true;
		}

		return false;
	}

	public int rightOblique(Chess chess, int x, int y) {
		int count = 1;
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
		while (j >= y - 4 && j >= 0 && i <= x + 4 && i <= 13) {
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
		int count = 1;
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
		int count = 1;
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
		int count = 1;
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
	
	public void concluate(int[][] arr) {
		int blackNum = 0;//五元组中的黑棋数量
	    int whiteNum = 0;//五元组中的白棋数量
	    int tupScore = 0;//五元组得分临时变量​
	    //1.横向15行
	    for (int i = 0;i<15;i++) {
	        for (int j = 0; j < 11; j++) {
	            int k = j;
	            while (k < j+5){
	            	if(getChess(i,k)!=null&&Color.WHITE.equals(getChess(i,k).getColor())) {
		             
	                    whiteNum++;
	                }else if(getChess(i,k)!=null&&Color.BLACK.equals(getChess(i,k).getColor())){
	                    blackNum++;
	                }
	                k++;
	            }
	            tupScore = tupleScore(blackNum,whiteNum);
	            //为五元组添加分数
	            for (k = j; k < j+5; k++) {
	                arr[i][k]+=tupScore;
	            }
	            //归零
	            blackNum = 0;//五元组中的黑棋数量
	            whiteNum = 0;//五元组中的白棋数量
	            tupScore = 0;//五元组得分临时变量
	        }
	    }
	    //纵向15行
	    for (int i = 0; i < 15; i++) {
	        for (int j = 0; j < 11; j++) {
	            int k = j;
	            while (k < j+5){
	            	if(getChess(k,i)!=null&&Color.WHITE.equals(getChess(k,i).getColor())) {
		                
	                    whiteNum++;
	                }else if(getChess(k,i)!=null&&Color.BLACK.equals(getChess(k,i).getColor())){
	                    blackNum++;
	                }
	                k++;
	            }
	            tupScore = tupleScore(blackNum,whiteNum);
	            for (k = j; k < j+5; k++) {
	                arr[k][i]+=tupScore;
	            }
	            //归零
	            blackNum = 0;
	            whiteNum = 0;
	            tupScore = 0;
	        }
	    }
	    //右上角到左下角的上侧部分
	    for (int i = 14; i >= 4 ; i--) {
	        for (int k = i,j = 0;j < 15 && k >= 0;j++,k--){
	            int m = k;
	            int n = j;
	            while (m > k - 5 && k - 5 >= -1){
	            	if(getChess(m,n)!=null&&Color.WHITE.equals(getChess(m,n).getColor())) {
		                
	                    whiteNum++;
	                }else if(getChess(m,n)!=null&&Color.BLACK.equals(getChess(m,n).getColor())){
	                    blackNum++;
	                }
	                m--;
	                n++;
	            }
	            if(m == k-5){
	                tupScore = tupleScore(blackNum,whiteNum);
	                for(m = k, n = j; m > k - 5 ; m--, n++){
	                    arr[m][n]+=tupScore;
	                }
	            }
	            blackNum = 0;
	            whiteNum = 0;
	            tupScore = 0;
	        }
	    }
	    //右上角到左下角下侧部分
	    for(int i = 1; i <= 14; i++){
	        for(int k = i, j = 14; j >= 0 && k < 15; j--, k++){
	            int m = k;
	            int n = j;
	            while(m < k + 5 && k + 5 <= 15){
	            	if(getChess(m,n)!=null&&Color.WHITE.equals(getChess(m,n).getColor())) {
		                
	                    whiteNum++;
	                }else if(getChess(m,n)!=null&&Color.BLACK.equals(getChess(m,n).getColor())){
	                    blackNum++;
	                }
	            	m++;
	                n--;
	            }
	            if(m == k+5){
	                tupScore = tupleScore(blackNum,whiteNum);
	                for(m = k, n = j; m < k + 5; m++, n--){
	                    arr[m][n]+=tupScore;
	                }
	            }
	            blackNum = 0;
	            whiteNum = 0;
	            tupScore=0;
	        }
	    }
	    //左上角到右下角上侧部分
	    for(int i = 0; i < 11; i++){
	        for(int j = 0, k = i; j < 15 && k < 15; j++, k++){
	            int m = k;
	            int n = j;
	            while(m < k + 5 && k + 5 <= 15){
	            	if(getChess(m,n)!=null&&Color.WHITE.equals(getChess(m,n).getColor())) {
		                
	                    whiteNum++;
	                }else if(getChess(m,n)!=null&&Color.BLACK.equals(getChess(m,n).getColor())){
	                    blackNum++;
	                }
	            	m++;
	                n++;
	            }
	            if(m == k + 5){
	                tupScore = tupleScore(blackNum,whiteNum);
	                for(m = k, n = j; m < k + 5; m++, n++){
	                    arr[m][n]+=tupScore;
	                }
	            }
	            blackNum = 0;
	            whiteNum = 0;
	            tupScore = 0;
	        }
	    }
	    //左上角到右下角下侧部分
	    for(int i = 1; i < 11; i++){
	        for(int k = i, j = 0; j < 15 && k < 15; j++, k++){
	            int m = k;
	            int n = j;
	            while(m < k + 5 && k + 5 <= 15){
	            	if(getChess(n,m)!=null&&Color.WHITE.equals(getChess(n,m).getColor())) {
		                
	                    whiteNum++;
	                }else if(getChess(n,m)!=null&&Color.BLACK.equals(getChess(n,m).getColor())){
	                    blackNum++;
	                }
	            	m++;
	                n++;
	            }
	            if(m == k + 5){
	                tupScore = tupleScore(blackNum,whiteNum);
	                for(m = k, n = j; m < k + 5; m++, n++){
	                    arr[n][m]+=tupScore;
	                }
	            }
	            blackNum=0;
	            whiteNum=0;
	            tupScore=0;
	        }
	    }
	}
//五元组评分表评分
public int tupleScore(int blackNum, int whiteNum){
	if(blackNum > 0 && whiteNum > 0){
	        return 0;
	    }
	    if(blackNum == 0 && whiteNum == 0){
	        return 7;
	    }
	    if(whiteNum == 1){
	        return 35;
	    }
	    if(whiteNum == 2){
	        return 800;
	    }
	    if(whiteNum == 3){
	        return 15000;
	    }
	    if(whiteNum == 4){
	        return 800000;
	    }
	    if(blackNum == 1){
	        return 15;
	    }
	    if(blackNum == 2){
	        return 400;
	    }
	    if(blackNum == 3){
	        return 1800;
	    }
	    if(blackNum == 4){
	        return 100000;
	    }
	    return -1;
	}
// 遍历找到没有棋子的坐标最大权重
public int[] che(int[][] arr){
	int[] maxarr=new int[2];
	int chessMax=0;
		for (int i = 0; i < 15; i++) {
	        for (int j = 0; j < 15; j++) {
	            if(chessMax< warr[i][j]&& !isHas(i,j)){
	            	maxarr[0]=i;
	            	maxarr[1]=j;
	            	chessMax=warr[i][j];
	            	for(int n=0;n<warr.length;n++) {
	            		for(int m=0;m<warr[n].length;m++) {
	            			System.out.print(warr[n][m]+" ");
	            		}
	            		System.out.println();
	            	}
	            }
	        }
	    }
		if(chessMax == 0){
	        System.out.println("和棋");
	    }
	//清空权重
	    for (int i = 0; i < 15; i++) {
	        for (int j = 0; j < 15; j++) {
	            warr[i][j]=0;
	        }
	    }
	    return maxarr;
	}

public void pcPlay() {
	int[]arr1 = che(warr);
	circle = new Circle(arr1[0] * padding + margin, arr1[1] * padding + margin, 18, Color.BLACK);
	chess = new Chess(arr1[0], arr1[1], Color.BLACK);
	// 将圆圈对象放到画板上
	//audio("drop_chess_effect.mp3");
	pane.getChildren().add(circle);
	// 将棋子对象存储到容器中
	chesses[count] = chess;
	count++;
	concluate(warr);
	// 判断是否胜利
	if (isWin(chess)) {
		isWin = true;
		// 创建弹出框对象
		Alert alert = new Alert(AlertType.INFORMATION);
		// 设置提示内容
		alert.setTitle("失败");
		alert.setHeaderText("您失败啦，继续加油哦~");
		alert.setContentText("...");

		// 展示弹出框
		alert.showAndWait();
	}
}
}
