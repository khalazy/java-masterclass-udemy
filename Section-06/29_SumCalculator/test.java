public class Test {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Subtraction: " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("Multiplication: " + calculator.getMultiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());
    }
}
