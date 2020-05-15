package base;

import utils.Constants;

public class FlightDetail {
	private int flightNumber;
	private String departure = Constants.DEPARTURE;
	private String arrival;
	private int day;
//	private int capacity = 0;

	public FlightDetail(int flightNumber, String arrival, int day) {
		this.flightNumber = flightNumber;
		this.arrival = arrival;
		this.day = day;
	}

	public int getFlightNumber() {
		return this.flightNumber;
	}

	public String getDeparture() {
		return this.departure;
	}

	public String getArrival() {
		return this.arrival;
	}

	public int getDay() {
		return this.day;
	}
	
//	public int getCapacity() {
//		return this.capacity;
//	}
//	
//	public void setCapacity(int capacity) {
//		this.capacity = capacity +1 ;
//	}
}
