package dataMessage;



public class AgainAlertMessage extends AlertMessage{

	public AgainAlertMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgainAlertMessage(String title, boolean isRequest, String headerText) {
		super(title, isRequest, headerText);
		// TODO Auto-generated constructor stub
	}

	public AgainAlertMessage(String title, String headerText, boolean isAgree, boolean isRequest) {
		super(title, headerText, isAgree, isRequest);
		// TODO Auto-generated constructor stub
	}

	public AgainAlertMessage(String title, String headerText, boolean isAgree) {
		super(title, headerText, isAgree);
		// TODO Auto-generated constructor stub
	}

	public AgainAlertMessage(String title, String headerText) {
		super(title, headerText);
		// TODO Auto-generated constructor stub
	} 
	
}
