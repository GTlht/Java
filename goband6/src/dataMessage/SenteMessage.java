package dataMessage;

import java.io.Serializable;

public class SenteMessage implements Serializable{
	private String str;
	private boolean isRequest;
	private boolean isAgree;
	
	public SenteMessage(String str, boolean isRequest) {
		super();
		this.str = str;
		this.isRequest = isRequest;
	}
	
	public SenteMessage(String str, boolean isRequest, boolean isSente) {
		super();
		this.str = str;
		this.isRequest = isRequest;
		this.isAgree = isSente;
	}
	

	

	public boolean isAgree() {
		return isAgree;
	}

	public void setAgree(boolean isAgree) {
		this.isAgree = isAgree;
	}

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public boolean isRequest() {
		return isRequest;
	}
	public void setRequest(boolean isRequest) {
		this.isRequest = isRequest;
	}
	

}
