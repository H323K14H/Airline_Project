import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;

    @BeforeEach
    void setUp() {
        airline = new Airline("Tom & Hezekiah's flights");
    }

    @Test
    void canCreateFlight() {
        airline.createFlight(12345, "Hackney");
        assertThat(airline.flightCount()).isEqualTo(1);
    }

}
