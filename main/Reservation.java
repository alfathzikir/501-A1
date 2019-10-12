package main;

public class Reservation {

	private String reservationName;

	public Reservation() {
		reservationName = "noone";
	}
	
	public void setReservationName(String aName) {
		reservationName = aName;
	}
	
	public String getReservationName() {
		return reservationName;
	}
	
}