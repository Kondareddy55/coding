
	public static void main(String args[])
	{

		Passenger passenger;
		 String    flightDay, flightDestination;
		 boolean   found = false;
		 Flight    myFlight = null;
		 Scanner   scan = new Scanner(System.in);


		 System.out.println(" On which day do you wish to travel ? ");
		 flightDay = scan.nextLine();

		 System.out.println(" What is your destination ? ");
		 flightDestination = scan.nextLine();


		 for ( Flight d  : flightList ) 
		 {
		    if (d.getDay().equals(flightDay) && d.getDestination().equals(flightDestination))
		    {
		        System.out.println("The Flight Day and Destination were found, the Flight will be booked.");
		    Passenger passengers = new Passenger ("Laura", "14 Rathmines Rd ","laura99@gmail.com" , myFlight);
		    passengerList.add(passengers);
		        found = true;
		        break;
		    }

		 }

		 if (found == false)
		 {

		    System.out.println("There is no flight booking.");
		 }

	}

}
