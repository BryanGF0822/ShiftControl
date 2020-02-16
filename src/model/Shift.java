package model;

public class Shift {
	
	private User user;
	
	private char letter;
	private int number;
	private String theShift;
	private boolean attended;
	
	public Shift(User user, char letter, int number) {
		super();
		this.user = user;
		this.letter = letter;
		this.number = number;
		attended = false;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTheShift() {
		return theShift;
	}

	public void setTheShift(String Shift) {
		this.theShift = Shift;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}

	
	public void theTicket() {
		
		theShift = letter + number + "";
	}
	
}
