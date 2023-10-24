import flights.Flight;

import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;


    public Airline(String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public void createFlight(int flightID, String destination) {
        Flight flight = new Flight(flightID, destination);
        this.flights.add(flight);
    }

    public int flightCount(){
        return this.flights.size();
    }

    public void addPassenger(String name, String contactInformation, int uniqueID) {
    }


}
