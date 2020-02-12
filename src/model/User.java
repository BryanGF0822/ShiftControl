package model;

import java.util.ArrayList;

public class User {
	
	public final static String CEDULA_DE_CIUDADANIA = "Cedula de ciudadania";
	public final static String TARJETA_DE_IDENTIDAD = "Tarjeta de identidad";
	public final static String REGISTRO_CIVIL = "Registro civil";
	public final static String PASAPORTE = "Pasaporte";
	public final static String CEDULA_DE_EXTRANJERIA = "Cedula de extranjeria";
	
	ArrayList<Shift> shift;
	
	private String typeOfDocument;
	private String idNumber;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String address;
	
	public User(String typeOfDocument, String idNumber, String firstName, String lastName, int phoneNumber, String address) {
		
		this.typeOfDocument = typeOfDocument;
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
		shift = new ArrayList<Shift>();
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Shift> getShift() {
		return shift;
	}

	public void setShift(ArrayList<Shift> shift) {
		this.shift = shift;
	}
	
	
	
	
}
