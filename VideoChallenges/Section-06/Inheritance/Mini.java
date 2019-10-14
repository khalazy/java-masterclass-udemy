public class Mini extends Car {

    private String color;
    private String model;

    public Mini() {
    }

    public Mini(boolean handSteering, int gears, int speed, String color, String model) {
        super(handSteering, gears, speed);
        this.color = color;
        this.model = model;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
