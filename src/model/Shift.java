package model;

public class Shift {
	
	private User shift;
	
	private static char letter;
	
	int num[] = new int[2];
	
	private boolean active;
	private boolean attend;
	public Shift(User shift, int[] num, boolean active) {
		this.shift = shift;
		this.num = num;
		this.active = active;
		this.attend = false;
	}
	public User getShift() {
		return shift;
	}
	public void setShift(User shift) {
		this.shift = shift;
	}
	public static char getLetter() {
		return letter;
	}
	public static void setLetter(char letter) {
		Shift.letter = letter;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
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
