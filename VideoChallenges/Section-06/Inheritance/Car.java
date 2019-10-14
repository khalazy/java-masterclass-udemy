public class Car extends Vehicle {

    public Car() {
    }

    public Car(boolean handSteering, int gears, int speed) {
        super(handSteering, gears, speed);
    }

    @Override
    public void setHandSteering(boolean handSteering) {
        super.setHandSteering(handSteering);
    }

    @Override
    public void setGears(int gears) {
        super.setGears(gears);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public boolean isHandSteering() {
        return super.isHandSteering();
    }

    @Override
    public int getGears() {
        return super.getGears();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
