public class Vehicle {

    private boolean handSteering;
    private int gears;
    private int speed;

    public  Vehicle() {
    }

    public Vehicle(boolean handSteering, int gears, int speed) {
        this.handSteering = handSteering;
        this.gears = gears;
        this.speed = speed;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
