package unit;

public class Bike extends Vehicle {
    private static int maxSpeed = 40;

    public Bike(String name) {
        super(name);
    }  

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void accelerate(double increase) {
        super.accelerate(increase);
        if (super.speed > maxSpeed) {
            super.speed = maxSpeed;
        }
    }

}
