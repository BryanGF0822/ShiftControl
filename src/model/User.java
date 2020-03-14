package model;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	
	public final static String CEDULA_DE_CIUDADANIA = "Cedula de ciudadania";
	public final static String TARJETA_DE_IDENTIDAD = "Tarjeta de identidad";
	public final static String REGISTRO_CIVIL = "Regitro civil";
	public final static String PASAPORTE = "Pasaporte";
	public final static String CEDULA_DE_EXTRANJERIA = "Cedula de extranjeria";
	
	private ArrayList<Shift> personalShifts;

	private String typeOfDocument;
	private String idNumber;
	private String firtsName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public User(String typeOfDocument, String idNumber, String firtsName, String lastName, String phoneNumber,
			String address) {
		
		personalShifts = new ArrayList<Shift>();

		this.typeOfDocument = typeOfDocument;
		this.idNumber = idNumber;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}

	public String getTypeOfDocument() {
		return typeOfDocument;
	}

	public void setTypeOfDocument(String typeOfDocument) {
		this.typeOfDocument = typeOfDocument;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void agregarShift(Shift actualShift) {
		
		personalShifts.add(actualShift);
	}

	public ArrayList<Shift> getPersonalShifts() {
		return personalShifts;
	}

	public void setPersonalShifts(ArrayList<Shift> personalShifts) {
		this.personalShifts = personalShifts;
	}
	
	

}
