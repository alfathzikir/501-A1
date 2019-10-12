package main;

public class Menu {

	Food[] foods = new Food[3];
	Drink[] drinks = new Drink[3];
	
	public Menu() {
		foods[0] = new Food();
		foods[1] = new Food();
		foods[2] = new Food();
		
		drinks[0] = new Drink();
		drinks[1] = new Drink();
		drinks[2] = new Drink();
	}
	
	public void setMenu() {
		foods[0].setItemName("Steak");
		foods[0].setItemPrice(25);
		
		foods[1].setItemName("Lobster");
		foods[1].setItemPrice(30);
		
		foods[2].setItemName("kids menu");
		foods[2].setItemPrice(14);
		
		drinks[0].setItemName("pop");
		drinks[0].setItemPrice(2);
		
		drinks[1].setItemName("wine");
		drinks[1].setItemPrice(8);
		
		drinks[2].setItemName("juice");
		drinks[2].setItemPrice(3);
	}
	
	public void printMenu() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Food:");
		System.out.println(foods[0].getItemName() + "\t\t$" + foods[0].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(foods[1].getItemName() + "\t\t$" + foods[1].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(foods[2].getItemName() + "\t$" + foods[2].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Drinks:");
		System.out.println(drinks[0].getItemName() + "\t\t$" + drinks[0].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(drinks[1].getItemName() + "\t\t$" + drinks[1].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(drinks[2].getItemName() + "\t\t$" + drinks[2].getItemPrice());
		System.out.println("---------------------------------------------------------------------------------------");
	}
}
