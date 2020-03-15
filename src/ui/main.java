package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.*;

public class Main {
	
	public static Time t = new Time();

	static Company control = new Company();

	public static void main(String[] args) {
		
		loadFiles();
		
		Main program = new Main();
		try {
			program.menu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void menu() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("**BIENVENIDO A SU SISTEMA DE TURNOS**");
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println(" ");

		boolean exit = false;
		int option = 0;

		while (exit == false) {
			
			t.refresh();
			System.out.println(t.getAll());
			System.out.println("");
			
			System.out.println("MENU DE OPCIONES");
			System.out.println(" ");

			System.out.println("1. Add a user.");
			System.out.println("2. Make a shift");
			System.out.println("3. Show Report");
			System.out.println("4. Exit");
			System.out.println(" ");

			System.out.println("please enter the action you wish to perform");
			option = Integer.parseInt(br.readLine());

			switch (option) {

			case 1:
				System.out.println("Please, select your type of document:");
				System.out.println("1. Cedula de ciudadania");
				System.out.println("2. Tarjeta de identidad");
				System.out.println("3. Registro civil");
				System.out.println("4. Pasaporte");
				System.out.println("5. Cedula de extranjeria");

				int op = Integer.parseInt(br.readLine());

				String typeOfDocument;
				if (op == 1) {
					typeOfDocument = User.CEDULA_DE_CIUDADANIA;
				} else if (op == 2) {
					typeOfDocument = User.TARJETA_DE_IDENTIDAD;
				} else if (op == 3) {
					typeOfDocument = User.REGISTRO_CIVIL;
				} else if (op == 4) {
					typeOfDocument = User.PASAPORTE;
				} else {
					typeOfDocument = User.CEDULA_DE_EXTRANJERIA;
				}

				System.out.println("Please, type your identification number:");
				String idNumber = br.readLine();

				System.out.println("Please, type your first name:");
				String firstName = br.readLine();

				System.out.println("Please, type your last name:");
				String lastName = br.readLine();

				System.out.println("Please, type your phone number:");
				String phoneNumber = br.readLine();

				System.out.println("Please, type your address:");
				String address = br.readLine();

				control.addUser(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);
				System.out.println("The user has been added correctly");
				System.out.println(" ");

				break;
				
			case 2:
				System.out.println("Please, type the id number to the user that you want to give a shift");
				String idNumberToSearch = br.readLine();
				
				System.out.println("Type of Shifth:");
				String typeS = br.readLine();
				
				System.out.println("Time of shifth: ");
				double timeS = Double.parseDouble(br.readLine());
				
				if (control.searchUser(idNumberToSearch) != null) {

					control.addShift(idNumberToSearch, typeS, timeS, t.getActualTime());

					System.out.println(control.searchUser(idNumberToSearch).getPersonalShifts().toString());

				}

				break;
				
			case 3:
				System.out.println(control.showReport());
				break;
				
			case 4:
				exit = true;
				saveFiles();
				System.out.println("Menú Cerrado");
			}

		}

	}

	public static void saveFiles() {

		try {
			File file = new File("data/company.data");
			if (file.exists() == false) {
				file.createNewFile();
			}

			ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(file));
			fileOut.writeObject(control);
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void loadFiles() {
		
		try {
			ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("data/company.data"));
			control = (Company) fileIn.readObject();
			
			if (control == null) {
				control = new Company();
			}
			fileIn.close();
			

		} catch (FileNotFoundException e) {
			System.out.println("The file has not found in the data folder.");
			control = new Company();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
