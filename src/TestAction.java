
public class TestAction {

	String message;
	String firstName;
	
	public String execute()
	{
		System.out.println("----farkkkkWILLSMITHexecute() method called");
		message = "errrrrr la Message";
		System.out.println("Name: "+firstName);
		return "willsmithy";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
