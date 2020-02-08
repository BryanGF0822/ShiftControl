package model;

public class User {
	
	private char typeOfDocument;
	private int idNumber;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String address;
	
	public User(char typeOfDocument, int idNumber, String firstName, String lastName, int phoneNumber, String address) {
		
		this.typeOfDocument = typeOfDocument;
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public char getTypeOfDocument() {
		return typeOfDocument;
	}

	public void setTypeOfDocument(char typeOfDocument) {
		this.typeOfDocument = typeOfDocument;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
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
	
	
	
	
}
