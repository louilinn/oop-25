package unit;

public class Vehicle {
    protected double speed = 0;
    private String name;

    public Vehicle (String name) {
        this.name = name;
    }
    

    public void accelerate(double increase) {
        speed =+ increase;
    }

    public void breaking(double decrease) {
        speed = speed - decrease;
        if (speed < 5) {
            speed = 5;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    


    public double getSpeed() {
        return speed;
    } 
}
