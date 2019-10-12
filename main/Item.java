package main;

public abstract class Item {
	
	public String itemName;
	public int itemPrice;
	
	public Item(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
}
