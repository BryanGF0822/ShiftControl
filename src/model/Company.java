package model;

import java.util.ArrayList;

public class Company {

	private ArrayList<User> users;

	public Company() {
		
		users = new ArrayList();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public void addUser(String typeOfDocument, String idNumber, String firstName, String lastName, int phoneNumber, String address) {
		
		User user = new User(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);
		
		users.add(user);
	}
}
