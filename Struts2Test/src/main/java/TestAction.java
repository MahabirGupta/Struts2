
public class TestAction {
	
//	create a variable
	String message;
	String firstName; //the variable name must be the same name as the name of the textfield in the welcome.jsp page
	
//	create an execute method
	public String execute() {
		
		System.out.println("execute() method called");
		message = "SUCCESS Message";
		
		System.out.println("Name: " + firstName);
		return "success";
	}

//	generate getter and setter for the message variable
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	generate getter and setter for the firstName variable
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	
	

}
