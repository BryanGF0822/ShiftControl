package model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Company implements Serializable {
	
	ArrayList<User> users;
	ArrayList<Shift> shifts;
	
	public Company() {
		users = new ArrayList<User>();
		shifts = new ArrayList<Shift>();
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Shift> getShifts() {
		return shifts;
	}

	public void setShifts(ArrayList<Shift> shifts) {
		this.shifts = shifts;
	}

	public void addUser(String typeOfDocument, String idNumber, String firstName, String lastName, String phoneNumber, String address) {
		
		User user = new User(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);
		
		users.add(user);
		
	}
	
	public User searchUser(String idNumber) {
		
		User user = null;
		boolean find = false;
		
		for (int i = 0; i < users.size() && !find; i++) {
			if (users.get(i).getIdNumber().equals(idNumber)) {
				
				user = users.get(i);
				find = true;
				
			}
		}
		return user;
		
	}
	
	public Shift newShift(String ctime) {
		
		int position = shifts.size()-1;
		
		char letter = 0 ;
		int[] number = new int[2];
		
		if (position != -1) {
			
			letter = shifts.get(position).getLetter();
			number = shifts.get(position).getNumber();
			
			if (number[1] == 10) {
				
				number [1] = 0;
				
				if (number[0] == 10) {
					
					number[0] = 0;
					
					if (letter == 'Z') {
						
						letter = 'A';
						
					}else {
						letter ++;
					}
					
				}else {
					number[0] ++;
				}
				
			}else {
				number[1] ++;
			}
		}else if (position == -1) {
			
			letter = 'A';
			number[1] = 0;
			number[0] = 0;
			
		}
		Shift theShift = new Shift(letter, number, ctime);
		
		return theShift;
	}
	
	public void addShift(String idNumber, String typeS, double timeS, String ctime) {
		
		User us = searchUser(idNumber);
		
		if (us != null) {
			
			Shift actualShift = newShift(ctime);
			TypeOfShift typeShift = new TypeOfShift(typeS, timeS);
			actualShift.setShiftType(typeShift);
			shifts.add(actualShift);
			
			us.agregarShift(actualShift);
			
		}
	}
	
	public String showReport() {
		
		String msg = "";
		for (int i = 0; i < users.size(); i++) {
		
			msg += users.get(i) + "\n";
		}
		return msg;
	}
}
