import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Passenger passenger1;
    Passenger passenger2;
    Bus bus;

    @Before
    public void setUp() {
        bus = new Bus("Hell", 30);
        passenger1 = new Passenger("Ben");
        passenger2 = new Passenger("Evil Indira");

    }

    @Test
    public void check_has_passengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void check_can_add_passenger(){
        bus.check_capacity();
        bus.add_passenger(passenger1);
        bus.add_passenger(passenger2);
        assertEquals(2, bus.getPassengers());
        assertEquals(true, bus.check_capacity());

    }

    @Test
    public void can_remove_passenger(){
        bus.add_passenger(passenger1);
        bus.remove_passenger(passenger1);
        assertEquals(0, bus.getPassengers());
    }


}
