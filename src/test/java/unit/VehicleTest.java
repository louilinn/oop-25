package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleTest {

    @Test
    public void shouldIncreaseSpeedWhenAccelerating() {
        Vehicle vehicle = new Vehicle("a");

        vehicle.accelerate(10);

        assertEquals(10, vehicle.getSpeed(), 0);
    }

    @Test
    public void shouldIncreaseSpeedByRightAmount() {
        Vehicle vehicle = new Vehicle("a");

        vehicle.accelerate(2);

        assertEquals(2, vehicle.getSpeed(), 0);
    }

    @Test
    public void shouldBreakNormal() {
         Vehicle vehicle = new Vehicle("a");

        vehicle.accelerate(10);
        vehicle.breaking(5);

        assertEquals(5, vehicle.getSpeed(), 0);
    }
    

    @Test
    public void shouldNotBreakMoreThanTo5() {
         Vehicle vehicle = new Vehicle("a");

        vehicle.accelerate(10);
        vehicle.breaking(15);

        assertEquals( 5, vehicle.getSpeed(), 0);
    }
}
