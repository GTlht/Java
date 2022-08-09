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
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderWidths;
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
import ui.ai.AiUi;
import ui.single.SingleUi;
import ui.web.MessgeUi;

public class MyApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// 获取画板对象
		Pane pane = new Pane();
		//Image imageOk = new Image(getClass().getResourceAsStream("1.jpg"));
		//URL url = this.getClass().getResource("4.jpg");
		//ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream("4.jpg")), 0, 0, 0.5, 0.5, true);
		//pane.setBackground(new Background(new BackgroundFill(Color.CYAN, null, null)));
		//pane.setBackground(new Background(new BackgroundFill(imagePattern, null, null)));
		pane.setId("pane10");
		pane.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		///pane.getChildren().add(imageOk);
		//创建单机版按钮
		Button singleButton=new Button("单机版");
		singleButton.setPrefSize(100, 100);
		singleButton.setLayoutX(125);
		singleButton.setLayoutY(150);
		singleButton.setId("button");
		singleButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		//singleButton.setBackground(new Background(new BackgroundFill(Color.FUCHSIA, null, null)));
		singleButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				 
			
				 SingleUi singleUi = new SingleUi();
					singleUi.show();
					stage.close();
				
				
			}
		});
		//创建网络版按钮
		Button webButton=new Button("网络版");
		webButton.setPrefSize(100, 100);
		webButton.setLayoutX(350);
		webButton.setLayoutY(150);
		webButton.setId("button");
		webButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		//webButton.setBackground(new Background(new BackgroundFill(Color.CHARTREUSE, null, null)));
		webButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessgeUi messgeUi = new MessgeUi();
				messgeUi.show();
				stage.close();
				
			}
		});
		Button aiButton=new Button("人机大战");
		aiButton.setPrefSize(100, 100);
		aiButton.setLayoutX(575);
		aiButton.setLayoutY(150);
		aiButton.setId("button");
		aiButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		aiButton.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, null, null)));
		aiButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				AiUi aiui=new AiUi();
				aiui.show();
				stage.close();
				
			}
		});
		
		pane.getChildren().addAll(singleButton, webButton,aiButton);
		// 创建场景对象，并将画板放到场景上
		Scene scene = new Scene(pane, 800, 400);
		
		// 将场景设置到舞台上
		stage.setScene(scene);
		stage.setTitle("五子棋");
		// 展示大舞台
		stage.show();
	}

	
	public static void main(String[] args) {
		// 启动
		launch(args);
	}
}
