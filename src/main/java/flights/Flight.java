package flights;

import passengers.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private int flightID;

    private String destination;
    private HashMap<Integer, Passenger> passengers;

    public Flight(int flightID, String destination){
        this.flightID = flightID;
        this.destination = destination;
        this.passengers = new HashMap<>();
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPassengers() {
        return passengers.size();
    }

}
