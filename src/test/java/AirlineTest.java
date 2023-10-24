import flights.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import passengers.Passenger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        airline = new Airline("Tom & Hezekiah's flights");
        airline.createFlight(12345, "Hackney");
        flight = new Flight(123, "Hackney");
        passenger = new Passenger("Tom", "Tom@gmail.com", 123);

    }

    @Test
    void canCreateFlight() {

        assertThat(airline.flightCount()).isEqualTo(1);
    }

    @Test
    void canDisplayFlights() {

        assertThat(airline.displayFlights()).isEqualTo("Flight ID 12345 Flight Destination Hackney");
    }

    @Test
    void canCreatePassenger() {


    }


}
