
public class TestAction {
	
//	create a variable
	String message;
	
//	create an execute method
	public String execute() {
		
		System.out.println("execute() method called");
		message = "ERROR Message";
		return "error";
	}

//	generate getter and setter for the message variable
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	

}
