package exceptions;

public class EmptyBoxException extends Exception {

	public EmptyBoxException() {
		super("a field has been left empty");
	}

	 
}
