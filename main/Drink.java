package main;


public class Drink extends Item{
	
	public Drink(String itemName, int itemPrice) {
		super(itemName,itemPrice);
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
