package model;

import java.util.ArrayList;

import exceptions.UserNotFoundException;

public class Company {

	private Shift ultimoDado;

	private Shift ultimoAtendido;

	private ArrayList<User> users;

	public Company() {

		users = new ArrayList<User>();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public void addUser(String typeOfDocument, String idNumber, String firstName, String lastName, int phoneNumber,
			String address) {

		User user = new User(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);

		users.add(user);
	}

	public char[] alphabetArray() {

		char[] alphabet = new char[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('A' + 1);
		}
		return alphabet;
	}

	public User searchUser(int id) throws UserNotFoundException {
		User user = null;
		boolean find = false;
		String idd = id + "";
		for (int i = 0; i < users.size() && !find; i++) {
			if (users.get(i).getIdNumber().equals(idd)) {
				user = users.get(i);
				find = true;
			}
		}
		if (user == null) {
			throw new UserNotFoundException(id);
		}
		return user;
	}

	public String registerAShift(int id) throws UserNotFoundException {
		String msg = "";
		User user = searchUser(id);

		return msg;
	}

	public char shifter(int charac, int num) {
		char a = (char) charac;
		if (num == 99) {
			a = (char) (charac + 1);
		}
		return a;

	}

}
