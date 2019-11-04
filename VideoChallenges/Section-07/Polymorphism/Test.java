class Car {
    private int wheels;
    private int cylinders;
    private boolean engine;
    private String name;

    Car(int cylinders, String name) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.name = name;
    }

    int getCylinders() {
        return cylinders;
    }

    String getName() {
        return name;
    }

    String startEngine() {
        return "Engine is either on or off.";
    }

    String accelerate() {
        return "Car is either accelerating or not.";
    }

    String brake() {
        return "Car is either braking or not.";
    }
}

class Cooper extends Car{
    Cooper(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Cooper S is starting engine.";
    }

    @Override
    String accelerate() {
        return "Cooper S is accelerating";
    }

    @Override
    String brake() {
        return "Cooper S is braking";
    }
}

class Model3 extends Car {
    Model3(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Model 3 is starting engine.";
    }

    @Override
    String accelerate() {
        return "Model 3 is accelerating.";
    }

    @Override
    String brake() {
        return "Model 3 is braking.";
    }
}

class Corvette extends Car {
    Corvette(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Corvette is starting engine.";
    }

    @Override
    String accelerate() {
        return "Corvette is accelerating.";
    }

    @Override
    String brake() {
        return "Corvette is braking.";
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car(0, "Default");
        Cooper cooper = new Cooper(6, "F56");
        Model3 model3 = new Model3(0, "Model 3");
        Corvette corvette = new Corvette(8, "Z06");

        System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
        System.out.println(car.accelerate() + "\n" + car.brake() + "\n" + car.startEngine());
        System.out.println();
        System.out.println(cooper.getName() + " has " + cooper.getCylinders() + " cylinders.");
        System.out.println(cooper.accelerate() + "\n" + cooper.brake() + "\n" + cooper.startEngine());
        System.out.println();
        System.out.println(model3.getName() + " has " + model3.getCylinders() + " cylinders.");
        System.out.println(model3.accelerate() + "\n" + model3.brake() + "\n" + model3.startEngine());
        System.out.println();
        System.out.println(corvette.getName() + " has " + corvette.getCylinders() + " cylinders.");
        System.out.println(corvette.accelerate() + "\n" + corvette.brake() + "\n" + corvette.startEngine());
    }
}
