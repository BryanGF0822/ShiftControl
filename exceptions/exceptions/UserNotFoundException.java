package exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	private String id;

	public UserNotFoundException(String id2) {
		super("The user is not register, please do it");
		this.id = id2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
