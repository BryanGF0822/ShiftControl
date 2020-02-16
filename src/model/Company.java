package model;

import java.util.ArrayList;

import exceptions.EmptyArrayException;

import exceptions.UserNotFoundException;

public class Company {

	private ArrayList<User> users;

	private ArrayList<Shift> shifts;
	
	private Shift actuals;

	public Company() {

		users = new ArrayList<User>();
		
		shifts = new ArrayList<Shift>();
		
		Shift sh = new Shift(null, 'A', 00);
		
		sh.setAttended(true);
		
		shifts.add(sh);
		
		unmetShift();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	

	public Shift getActuals() {
		return actuals;
	}

	public void setActuals(Shift actuals) {
		this.actuals = actuals;
	}

	public void addUser(String typeOfDocument, String idNumber, String firstName, String lastName, int phoneNumber,
			String address) {

		User user = new User(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);

		users.add(user);
	}

	public User searchUser(String idNumber) throws UserNotFoundException {
		User user = null;
		boolean find = false;
		for (int i = 0; i < users.size() && !find; i++) {
			if (users.get(i).getIdNumber().equalsIgnoreCase(idNumber)) {
				user = users.get(i);
				find = true;
			} else if (i == users.size() - 1 && users.get(i++) == null) {

				throw new UserNotFoundException(idNumber);
			}
		}

		return user;
	}

	public String registerAShift(String idNumber) throws UserNotFoundException {
		String msg = "";
		User user = searchUser(idNumber);

		return msg;
	}

	public int lastShiftCreated() throws EmptyArrayException {
		int position = shifts.size();

		if (position == 0) {
			throw new EmptyArrayException();
		}

		return position;
	}

	public String theNewShift() {

		char letter = shifts.get(shifts.size() - 1).getLetter();
		int number = shifts.get(shifts.size() - 1).getNumber();
		String theShift = shifts.get(shifts.size()-1).getTheShift();
		
		if (shifts.get(0) != null) {
			if (!theShift.equalsIgnoreCase("Z99")) {
				if (shifts.get(shifts.size()-1).getNumber() == 99) {
					
					letter = (char) (letter + 1);
					number = 00;
					
					theShift = letter + "" + number + "";
					
				}else {
					number = number + 1;
				}
				
			}else {
				letter = 'A';
				number = 00;
				theShift = letter + "" + number + "";			}
			
		}else {
			letter = 'A';
			number = 00;
			theShift = letter + "" + number + "";
		}
		
		return theShift;
		
	}
	
	public void addShift(String idNumber) throws UserNotFoundException {
		
		if (shifts.get(0).getUser() == null) {
			
			User newUser = searchUser(idNumber);
			shifts.get(0).setUser(newUser);
			
		}else {
			
			User u = searchUser(idNumber);
			String num0 = theNewShift();
			String num1;
			if (num0.charAt(1) == 0) {
				
				num1 = num0.charAt(1) + num0.charAt(2) + "";
			
			}else {
				num1 = num0.charAt(1) + "";
			}
			Shift sh = new Shift(num0.charAt(0), Integer.parseInt(num1), u);			
			shifts.add(sh);
		}
		
	}
	
	public void unmetShift() {
		
		boolean attended =  false;
		
		for (int i = 0; i < shifts.size() && !attended; i++) {
			
		if (shifts.get(i) != null) {
			
			if (!shifts.get(i).isAttended()) {
				
				System.out.println("He hasn't been attended to");
				attended = true;
				actuals = shifts.get(i);
				
			}else {
				throw new NullPointerException("there are no shifts to attend to.");
			}
				
			}
			
		}
	}
	
	public void attended() {
		
		unmetShift();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Main
	// addShiftToUser(shift.get(lasShiftCreated()).getLetter(),shift.get(lasShiftCreated().getNum()))
//	public Shift addShiftToUser(char letter, int[] num) {
//		if (letter == 'z' && num[0] == 9 && num[1] == 9) {
//			letter = 'A';
//		} else if(num[1] == 9) {
//			num[0]++;
//			num[1] = 0;
//		} else if (num[0] == 9 && num[1] == 9) {
//			letter++;
//		}else {
//			num[1]++;
//		}
//		return new Shift(letter,num,true);
//		
//	}
	// Shift nuevoTurno = addShiftToUser();
	// Main user.get(i = la posion del usuario que le desea agregar el nuevo
	// turno).getShift().addTurnoUsuario(nuevoTurno));

//	public char[] alphabetArray() {
//
//		char[] alphabet = new char[26];
//
//		for (int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = (char) ('A' + 1);
//		}
//		return alphabet;
//	}

//	public char shifter(int charac, int num) {
//		char a = (char) charac;
//		if (num == 99) {
//			a = (char) (charac + 1);
//		}
//		return a;
//
//	}

}
