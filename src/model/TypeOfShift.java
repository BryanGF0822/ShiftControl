package model;

import java.io.Serializable;

public class TypeOfShift implements Serializable {
	
	private String typeS;
	private double timeS;
	
	public TypeOfShift(String typeS, double timeS) {
		this.typeS = typeS;
		this.timeS = timeS;
	}

	public String getTypeS() {
		return typeS;
	}

	public void setTypeS(String typeS) {
		this.typeS = typeS;
	}

	public double getTimeS() {
		return timeS;
	}

	public void setTimeS(double timeS) {
		this.timeS = timeS;
	}
	
	
}
