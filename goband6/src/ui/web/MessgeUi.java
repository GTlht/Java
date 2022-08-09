package ui.web;







import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import dataMessage.AgainAlertMessage;
import dataMessage.ChessMessage;
import dataMessage.ExitAlertMessage;
import dataMessage.Global;
import dataMessage.RegretAlertMessage;
import dataMessage.SenteMessage;
import dataMessage.TakingMessage;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MessgeUi extends Stage{
	public MessgeUi() {
		Pane pane=new Pane();
		Label mip = new Label("我的IP:");
		mip.setLayoutX(20);
		mip.setLayoutY(30);
		Label mport = new Label("我的端口:");
		mport.setLayoutX(20);
		mport.setLayoutY(80);
		Label oip = new Label("对方IP:");
		oip.setLayoutX(20);
		oip.setLayoutY(130);
		Label oport = new Label("对方端口:");
		oport.setLayoutX(20);
		oport.setLayoutY(180);
		pane.getChildren().addAll(mip,mport,oip,oport);
		
		TextField mip_text=new TextField();
		mip_text.setLayoutX(90);
		mip_text.setLayoutY(25);
		TextField mport_text=new TextField();
		mport_text.setLayoutX(90);
		mport_text.setLayoutY(75);
		TextField oip_text=new TextField();
		oip_text.setLayoutX(90);
		oip_text.setLayoutY(125);
		TextField oport_text=new TextField();
		oport_text.setLayoutX(90);
		oport_text.setLayoutY(175);
		pane.getChildren().addAll(mip_text,mport_text,oip_text,oport_text);
		
		Button startButton=new Button("确认");
		startButton.setPrefSize(80, 30);
		startButton.setLayoutX(30);
		startButton.setLayoutY(240);
		startButton.setId("button");
		startButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		startButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Global.mip = mip_text.getText();
				Global.mport =Integer.parseInt( mport_text.getText());
				Global.oip = oip_text.getText();
				Global.oport = Integer.parseInt(oport_text.getText());
				
				WebUi webui= new WebUi();
				webui.show();
				
				//接收
				new Thread() {
					public void run() {
						try {
							ServerSocket ss=new ServerSocket(Global.mport);
							while(true) {
								Socket s = ss.accept();
								ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
								Object obj = ois.readObject();
								if(obj instanceof ChessMessage) {
									ChessMessage cm=(ChessMessage)obj;
									webui.updata(cm);
								}else if(obj instanceof AgainAlertMessage) {
									AgainAlertMessage am=(AgainAlertMessage)obj;
									System.out.println("接收");
									webui.alterAgain(am,am.isRequest()); 
									
								}else if(obj instanceof RegretAlertMessage){
									RegretAlertMessage rm=(RegretAlertMessage)obj;
									webui.alertRegret(rm, rm.isRequest());
								}else if(obj instanceof ExitAlertMessage) {
									Platform.runLater(new Runnable() {
										
										@Override
										public void run() {
											Alert alert = new Alert(AlertType.CONFIRMATION);
											// 设置提示内容
											alert.setTitle("退出");
											alert.setHeaderText("对方认输跑路了");
											alert.initOwner(webui);
											alert.setContentText("即将退出");
											alert.showAndWait();
											webui.close();
											
										}
									});
									
							}else if(obj instanceof TakingMessage) {
								TakingMessage tm=(TakingMessage)obj;
								webui.alertTaking(tm);
							}else if(obj instanceof SenteMessage) {
								SenteMessage sm=(SenteMessage)obj;
								webui.alertSente(sm);
							}
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}finally {
							
						}
					}
				}.start();;
				MessgeUi.this.close();
			}
		});
		
		Button quitButton=new Button("取消");
		quitButton.setPrefSize(80, 30);
		quitButton.setLayoutX(220);
		quitButton.setLayoutY(240);
		quitButton.setId("button");
		quitButton.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		quitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessgeUi.this.close();
				
			}
		});
		pane.getChildren().addAll(startButton,quitButton);
		pane.setBackground(new Background(new BackgroundFill(Color.CYAN, null, null)));
		Scene scene = new Scene(pane, 320, 300);
		// 将场景设置到舞台上
		this.setScene(scene);
	}

}
