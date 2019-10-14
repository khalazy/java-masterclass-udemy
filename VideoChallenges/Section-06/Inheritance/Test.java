public class Test {
    public static void main(String[] args) {

        Vehicle tank = new Vehicle(false, 0, 45);
        Car hatchback = new Car(true, 6, 130);
        Mini cooperS = new Mini(true, 6, 140, "silver", "f56");

        System.out.println("Tank = " + tank.isHandSteering() + " " + tank.getGears() + " " + tank.getSpeed());
        System.out.println("Hatchback = " + hatchback.isHandSteering() + " " + hatchback.getGears() + " " + hatchback.getSpeed());
        System.out.println("Mini = " + cooperS.isHandSteering() + " " + cooperS.getGears() + " " + cooperS.getSpeed()
        + " " + cooperS.getColor() + " " + cooperS.getModel());
    }
}
