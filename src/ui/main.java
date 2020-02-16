package ui;

import model.*;

import java.util.Scanner;

import exceptions.EmptyBoxException;
import exceptions.UserNotFoundException;

public class main {

	Company control = new Company();

	public static void main(String[] args) {
		main program = new main();
		program.menu();
	}

	public void menu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("WELCOME TO THE SHIFT SYSTEM");
		System.out.println("By Bryan - THE BEST");
		System.out.println("============================================");
		System.out.println("============================================");

		boolean exit = false;
		int option;

		while (exit == false) {

			System.out.println(" ");
			System.out.println("Options Menu");
			System.out.println("============");
			System.out.println("1. Add new user");
			System.out.println("2. Register a shift");
			System.out.println("3. Attention shift");
			System.out.println("4. Exit");
			System.out.println(" ");

			System.out.println("Please enter the action you wish to perform:");
			option = Integer.parseInt(sc.nextLine());

			switch (option) {

			case 1:
				try {
					System.out.println("Select type of document: ");
					System.out.println("1. Cedula de ciudadania.");
					System.out.println("2. Tarjeta de identidad.");
					System.out.println("3. Registro civil.");
					System.out.println("4. pasaporte.");
					System.out.println("5. Cedula de extrajeria.");

					int op = Integer.parseInt(sc.nextLine());
					String typeOfDocument = "";
					if (op == 1)
						typeOfDocument = User.CEDULA_DE_CIUDADANIA;
					else if (op == 2)
						typeOfDocument = User.TARJETA_DE_IDENTIDAD;
					else if (op == 3)
						typeOfDocument = User.REGISTRO_CIVIL;
					else if (op == 4)
						typeOfDocument = User.PASAPORTE;
					else if (op == 5)
						typeOfDocument = User.CEDULA_DE_EXTRANJERIA;
					else
						throw new EmptyBoxException();
					
					System.out.println("Digite el ID");
					String idNumber = sc.nextLine();
					if (idNumber.equals("")) { 
						throw new EmptyBoxException();
						
					}
					
					System.out.println("Digite el nombre: ");
					String firstName = sc.nextLine();
					if (firstName.equals("")) {
						throw new EmptyBoxException();
						
					}
					
					System.out.println("Digite el apellido: ");
					String lastName = sc.nextLine();
					if (lastName.equals("")) {
						throw new EmptyBoxException();						
					}
					
					int phoneNumber;
					System.out.println("Digite un numero de telefono: ");
					String tmp = sc.nextLine();
					if (tmp.equals("")) {
						phoneNumber = 0;
					}else {
						phoneNumber = Integer.parseInt(tmp);
					}
					
					System.out.println("Digite una direccion: ");
					String address = sc.nextLine();
					
					control.addUser(typeOfDocument, idNumber, firstName, lastName, phoneNumber, address);
					System.out.println("El usuario de agrego correctamente.");
					
				} catch (EmptyBoxException e) {
					System.out.println(e.getMessage());
				}

				break;

			case 2:
				System.out.println("Type the user ID number");
				String idNumber = sc.nextLine();
				try {
					System.out.println(control.registerAShift(idNumber));
				} catch (UserNotFoundException e) {
					e.getMessage();
				}
				
				
				break;

			case 3:
				break;

			case 4:
				exit = true;
				System.out.println("Closed menu");
				break;
			}

		}

	}

}
