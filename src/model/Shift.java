package model;

import java.io.Serializable;
import java.util.Arrays;

public class Shift implements Serializable {
	
	private TypeOfShift shiftType;

	private char letter;
	private int[] number = new int[2];
	private String theShift;
	private String creationTime;
	private boolean attended;
	
	public Shift(char letter, int[] number, String creationTime) {
		
		this.letter = letter;
		this.number = number;
		this.creationTime = creationTime;
		attended = false;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public String getTheShift() {
		return theShift;
	}

	public void setTheShift(String theShift) {
		this.theShift = theShift;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}

	public TypeOfShift getShiftType() {
		return shiftType;
	}

	public void setShiftType(TypeOfShift shiftType) {
		this.shiftType = shiftType;
	}

	@Override
	public String toString() {
		
		String msg = "";
		return msg += "Shift: " + letter + Arrays.toString(number) + " Type: " + shiftType.getTypeS() + " Time: " + shiftType.getTimeS();
	}
	
	
	
}
