import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import passengers.Passenger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp() {passenger = new Passenger("Hezekiah", "Hezekiah@gmail.com", 123);}

    @Test
    public void canGetName() {
        assertThat(passenger.getName()).isEqualTo("Hezekiah");
    }
    @Test
    public void canSetName() {
        passenger.setName("Tom");
        assertThat(passenger.getName()).isEqualTo("Tom");
    }

    @Test
    public void canGetContactInformation() {
        assertThat(passenger.getContactInformation()).isEqualTo("Hezekiah@gmail.com");
    }

    @Test
    public void canSetContactInformation() {
        passenger.setContactInformation("Tom@gmail.com");
        assertThat(passenger.getContactInformation()).isEqualTo("Tom@gmail.com");
    }

    @Test
    public void canGetUniqueID() {
        assertThat(passenger.getUniqueID()).isEqualTo(123);
    }
    @Test
    public void canSetUniqueID() {
        passenger.setUniqueID(321);
        assertThat(passenger.getUniqueID()).isEqualTo(321);
    }




}
