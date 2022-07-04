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
	private int width = 1000;
	private int height = 1000;
	private int padding = 40;
	private int margin = 100;
	int count = 0;
	boolean flag = true;// 用于棋子颜色交换
	static boolean[][] arr = new boolean[100][100];// 用于防止覆盖

	@Override
	public void start(Stage stage) throws Exception {
		// 创建画板对象
		Pane pane = getPane();

		pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			// boolean flag=false;

			@Override
			public void handle(MouseEvent event) {

				count++;
				System.out.println(count);
				double x = event.getX();
				double y = event.getY();
				if (x < margin || x > width - margin || y < margin || y > height - margin) {
					return;
				}

				int _x = (int) (x - margin + padding / 2) / padding;
				int _y = (int) (y - margin + padding / 2) / padding;

				if (!arr[_x][_y]) {
					arr[_x][_y] = true;
					Circle circle1 = new Circle(_x * padding + margin, _y * padding + margin, 10,
							javafx.scene.paint.Color.BLACK);
					Circle circle2 = new Circle(_x * padding + margin, _y * padding + margin, 10,
							javafx.scene.paint.Color.AZURE);
					if (flag) {
						pane.getChildren().add(circle1);
						flag = false;
					} else {
						pane.getChildren().add(circle2);
						flag = true;
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
