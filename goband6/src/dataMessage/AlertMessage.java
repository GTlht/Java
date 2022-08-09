package dataMessage;

import java.io.Serializable;

public class AlertMessage implements Serializable{
	private String title;
	private String headerText;
	private boolean isAgree;
	private boolean isRequest;
	
	public AlertMessage(String title, String headerText, boolean isAgree) {
		super();
		this.title = title;
		this.headerText = headerText;
		this.isAgree = isAgree;
	}
	
	public AlertMessage(String title, String headerText) {
		super();
		this.title = title;
		this.headerText = headerText;
	}

	
	public AlertMessage(String title, String headerText, boolean isAgree, boolean isRequest) {
		super();
		this.title = title;
		this.headerText = headerText;
		this.isAgree = isAgree;
		this.isRequest = isRequest;
	}

	public AlertMessage(String title,  boolean isRequest,String headerText) {
		super();
		this.title = title;
		this.headerText = headerText;
		this.isRequest = isRequest;
	}

	public boolean isRequest() {
		return isRequest;
	}

	public void setRequest(boolean isRequest) {
		this.isRequest = isRequest;
	}

	public AlertMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHeaderText() {
		return headerText;
	}
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}
	public boolean isAgree() {
		return isAgree;
	}
	public void setAgree(boolean isAgree) {
		this.isAgree = isAgree;
	}
	
	
}
