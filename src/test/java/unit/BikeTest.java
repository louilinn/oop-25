package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BikeTest {

    @Test
    public void shouldNotIncreaseBeyondMaxSpeed() {
        Vehicle bike = new Bike("bike");

        bike.accelerate(50);

        assertEquals(Bike.getMaxSpeed(), bike.getSpeed(), 0);
    }
}
