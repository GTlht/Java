package ui.web;







import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import dataMessage.ChessMessage;
import dataMessage.Global;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
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
		startButton.setLayoutY(220);
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
		quitButton.setLayoutX(150);
		quitButton.setLayoutY(220);
		quitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				MessgeUi.this.close();
				
			}
		});
		pane.getChildren().addAll(startButton,quitButton);
		Scene scene = new Scene(pane, 320, 300);
		// 将场景设置到舞台上
		this.setScene(scene);
	}

}
