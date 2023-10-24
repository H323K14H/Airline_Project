import java.util.ArrayList;

public class Flight {

    private int flightID;

    private String destination;
//    private ArrayList<Passenger> passengers;

    public Flight(int flightID, String destination){
        this.flightID = flightID;
        this.destination = destination;
//        this.passengers = new ArrayList<>();
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

//    public ArrayList<Passenger> getPassengers() {
//        return passengers.size();
//    }

}
