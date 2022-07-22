package com;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MyApplication extends Application {
	protected static final javafx.scene.paint.Color AZURE = null;
	protected static final javafx.scene.paint.Color BLACK = null;
	private int width = 1000;
	private int height = 1000;
	private int padding = 40;
	private int margin = 100;
	private int number = (width - 2 * margin) / padding;
	int count = 0;
	int chessCount=1;
	boolean isWin=false;
	boolean flag = true;// 用于棋子颜色交换
	// static boolean[][] arr = new boolean[100][100];// 用于防止覆盖
	Chess[] chessArr = new Chess[number * number];

	@Override
	public void start(Stage stage) throws Exception {
		// 创建画板对象
	
		Pane pane = getPane();
		
		// 绑定鼠标点击事件
		pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			// boolean flag=false;

			@Override
			public void handle(MouseEvent event) {
			
				if(isWin) {
					System.out.println("赢了");
					return;

				}
				
				double x = event.getX();
				double y = event.getY();
				if (x < margin || x > width - margin || y < margin || y > height - margin) {
					return;
				}

				int _x = (int) (x - margin + padding / 2) / padding;
				int _y = (int) (y - margin + padding / 2) / padding;

				if (!reuse(_x, _y)) {
					return;
				}

				Circle circle1 = new Circle(_x * padding + margin, _y * padding + margin, 10,
						javafx.scene.paint.Color.BLACK);
				Circle circle2 = new Circle(_x * padding + margin, _y * padding + margin, 10,
						javafx.scene.paint.Color.AZURE);

				if (flag) {
					pane.getChildren().add(circle1);
					flag = false;
					if(isWin(chessArr[count++] = new Chess(_x, _y, BLACK))) {
						isWin=true;
						return;
					}
					
				} else {
					pane.getChildren().add(circle2);
					flag = true;
					if(isWin(chessArr[count++] = new Chess(_x, _y, AZURE))) {
						isWin=true;
						return;
					}
					
				}
				
			}

		});

		// 创建场景对象，并且将画板放到场景上
		Scene scene = new Scene(pane, 1000, 1000);

		// 将场景设置到舞台上
		stage.setScene(scene);

		// 展示大舞台
		stage.show();
	}
	public boolean isWin(Chess chess) {
		int x=chess.getX();
		int y=chess.getY();
		
		for(int i=x+1;i<x+4;i++) {
			Chess _chess=getChess(i,y);
			if(_chess!=null&&_chess.getColor().equals(chess.getColor())) {
				chessCount++;
			}else {
				break;
			}
		}
		for(int i=x-1;i>x-4;i--) {
			Chess _chess=getChess(i,y);
			if(_chess!=null&&_chess.getColor().equals(chess.getColor())) {
				chessCount++;
			}else {
				break;
			}
		}
		if(chessCount>=5) {
			chessCount=1;
			return true;
		}
		chessCount=1;
		return false;
		
	}

	public Chess getChess(int x,int y) {
		for(int i=0;i<count;i++) {
			if(chessArr[i].getX()==x&&chessArr[i].getY()==y) {
				return chessArr[i];
			}
			
		}
		return null;
	}
	public boolean reuse(int x, int y) {
		for (int i = 0; i < count; i++) {
			if (chessArr[i].getX() == x && chessArr[i].getY() == y) {

				return false;
			}
		}
		return true;

	}

	private Pane getPane() {
		Pane pane = new Pane();
		pane.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.CORNSILK, null, null)));
		;
		for (int i = 0; i <= (width - 2 * margin) / padding; i++) {
			Line line_x = new Line(margin, padding * i + margin, width - margin, padding * i + margin);
			Line line_y = new Line(padding * i + margin, margin, padding * i + margin, height - margin);
			pane.getChildren().add(line_x);
			pane.getChildren().add(line_y);
		}
		return pane;
	}

	public static void main(String[] args) {
		// 启动
		launch(args);
	}
}
