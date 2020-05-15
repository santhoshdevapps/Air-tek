package base;

import tasks.FlightScheduling;
import tasks.OrderScheduling;

public class Results {

	public static void main(String[] args) {

		FlightScheduling flightScheduling = new FlightScheduling();
		flightScheduling.scheduling();
		
		OrderScheduling orderScheduling = new OrderScheduling();
		orderScheduling.scheduling();
	}

	
}
