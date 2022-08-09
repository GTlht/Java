package dataMessage;

import java.io.Serializable;

public class TakingMessage implements Serializable {
	private String str;
	private boolean isRequest;
	public TakingMessage(String str, boolean isRequest) {
		super();
		this.str = str;
		this.isRequest = isRequest;
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
