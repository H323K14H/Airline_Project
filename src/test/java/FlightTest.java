import flights.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    @BeforeEach
    public void setUp() {
        flight = new Flight(12345, "Cyprus");
    }

    @Test
    public void canGetFlightId() {
        assertThat(flight.getFlightID()).isEqualTo(12345);
    }

    @Test
    public void canSetFlightId() {
        flight.setFlightID(54321);
        assertThat(flight.getFlightID()).isEqualTo(54321);

    }

    @Test
    public void canGetDestination() {
        assertThat(flight.getDestination()).isEqualTo("Cyprus");

    }

    @Test
    public void canSetDestination() {
        flight.setDestination("Hackney");
        assertThat(flight.getDestination()).isEqualTo("Hackney");

    }


}
