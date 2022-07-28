package Test;

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

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import pojo.Chess;
import ui.single.SingleUi;
import ui.web.MessgeUi;

public class MyApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// 获取画板对象
		Pane pane = new Pane();
		//创建单机版按钮
		Button singleButton=new Button("单机版");
		singleButton.setPrefSize(100, 100);
		singleButton.setLayoutX(40);
		singleButton.setLayoutY(45);
		singleButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				SingleUi singleUi;
				try {
					singleUi = new SingleUi();
					singleUi.show();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.close();
				
			}
		});
		//创建网络版按钮
		Button webButton=new Button("网络版");
		webButton.setPrefSize(100, 100);
		webButton.setLayoutX(250);
		webButton.setLayoutY(45);
		webButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessgeUi messgeUi = new MessgeUi();
				messgeUi.show();
				stage.close();
				
			}
		});
		pane.getChildren().addAll(singleButton, webButton);
		// 创建场景对象，并将画板放到场景上
		Scene scene = new Scene(pane, 400, 200);
		
		// 将场景设置到舞台上
		stage.setScene(scene);
		// 展示大舞台
		stage.show();
	}

	
	public static void main(String[] args) {
		// 启动
		launch(args);
	}
}
