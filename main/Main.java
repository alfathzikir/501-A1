package main;

import java.util.Scanner;

public class Main {
	
    private static boolean MainMenu = true;
    private static boolean SubMenu = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tableNum = 0;
        Reservation[] reservation = new Reservation[5];
        reservation[0] = new Reservation();
        reservation[1] = new Reservation();
        reservation[2] = new Reservation();
        reservation[3] = new Reservation();
        reservation[4] = new Reservation();
        
        Menu menuItems = new Menu();
 
		while (MainMenu) {
			while (SubMenu) {
				printInterface();
					String Selection = input.next();
					switch (Selection) {
					case "1":
						menuItems.setMenu();
						menuItems.printMenu();
						break;
					case "2":
						reserve(reservation, tableNum);
						break;
					case "3":
						about();
						break;
					default:
						System.out.println("Invalid Selection");
						break;
					}
					System.out.println("---------------------------------------------------------------------------------------");
	                System.out.println("Would you like to select other options\n1: Yes\n2: No");
	                System.out.println("---------------------------------------------------------------------------------------");
	                if (input.nextInt() == 1) {
	                    SubMenu = true;
	                } else {
	                    SubMenu = false;
	                }
			}
            SubMenu = true;
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Would you like to exit?\n1: Yes\n2: No");
            System.out.println("---------------------------------------------------------------------------------------");
            if (input.nextInt() == 2) {
                MainMenu = true;
            } else {
                System.out.println("");
                System.exit(0);

            }
		}
	}
	
	public static void printInterface() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Hello and Welcome to our Restaurant!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Please select one of the options.");
		System.out.println("1: Look at the menu.");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("2: Reserve a table.");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("3: Order food for pick up.");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("4: More about us.");
		System.out.println("---------------------------------------------------------------------------------------");
	}

	private static void reserve(Reservation[] reservation, int tableNum) {
        String tableName;
        boolean reserving = true;
        while (reserving){
        	Scanner input = new Scanner(System.in);
        	System.out.println("---------------------------------------------------------------------------------------");
        	System.out.println("Here are all the tables of this restaurant:");
        	System.out.println("---------------------------------------------------------------------------------------");
        	for (int x = 0; x < reservation.length; x++) {
        		System.out.println("Table " + (x + 1) + " reserved by " + reservation[x].getReservationName());
        	}
        	System.out.println("Enter table number that you want to reserve (1-5):");
        	tableNum = input.nextInt() - 1;
            boolean isNotAvailable = reservation[tableNum].getReservationName() != "noone";
        	if (isNotAvailable) {
        		System.out.println("Table has already been reserved by someone else please choose another table");
        		break;
        	}
        	System.out.println("Enter reservation name for table " + (tableNum + 1) + " :");
        	tableName = input.next();
        	reservation[tableNum].setReservationName(tableName);
        	reserving = false;
        	}
	}
	
	private static void about() {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Created by: Alfath Zikir || UCID: 30027320");
		System.out.println("---------------------------------------------------------------------------------------");
	}
	
}
