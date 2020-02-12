package model;

public class Shift {
	
	private static char letter;
	private static String shiftNumber;
	private boolean active;
	private boolean attend;
	
	public Shift(boolean active, boolean attend) {
		super();
		this.active = active;
		this.attend = attend;
	}

	public static char getLetter() {
		return letter;
	}

	public static void setLetter(char letter) {
		Shift.letter = letter;
	}

	public static String getShiftNumber() {
		return shiftNumber;
	}

	public static void setShiftNumber(String shiftNumber) {
		Shift.shiftNumber = shiftNumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isAttend() {
		return attend;
	}

	public void setAttend(boolean attend) {
		this.attend = attend;
	}
	
	
	
}
