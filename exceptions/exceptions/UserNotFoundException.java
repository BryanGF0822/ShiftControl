package exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	private int id;

	public UserNotFoundException(int id2) {
		super("The user is not register, please do it");
		this.id = id2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
