package WZQ4.src.com;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MyApplication extends Application {
	private int width = 560;//棋盘的宽度
	private int height = 560;//棋盘的高度
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
	
	@Override
	public void start(Stage stage) throws Exception {
		//获取画板对象
		Pane pane = getPane();
		
		//创建场景对象，并将画板放到场景上
		Scene scene = new Scene(pane, width, height);
		
		//将场景设置到舞台上
		stage.setScene(scene);
		
		//展示大舞台
		stage.show();
	}

	//获取画板对象
	public Pane getPane() {
		//创建画板对象
		Pane pane = new Pane();
		
		//给画板设置颜色
		pane.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));
		
		//给画板绑定鼠标点击事件
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
		
		//创建线条对象
		int increment = 0;
		for(int i = 0; i < lineCount; i++) {
			Line rowLine = new Line(margin, margin + increment, width - margin, margin + increment);
			Line colLine = new Line(margin + increment, margin, margin + increment,  width - margin);
			
			//将线条放到画板中
			pane.getChildren().add(rowLine);
			pane.getChildren().add(colLine);
			
			increment += padding;
		}
		
		return pane;
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
		System.out.println(a);
		
		while(a <=y + 4 && a <=13&&b<=x+4&&b<=13) {
			Chess _chess = getChess(b, a);
			//判断是否有棋子并且颜色是否一致
			if(_chess != null && _chess.getColor().equals(chess.getColor())) {
				//计数+1
				
				xIsWinCount++;
				System.out.println("laiguo");
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
