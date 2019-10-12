package main;

public class Table {

	private String mainName;
	int numofChairs;
	
	public Table() {
		mainName = "noone";
	}
	
	public void setName(String aName) {
		mainName = aName;
	}
	
	public String getName() {
		return mainName;
	}
	
}