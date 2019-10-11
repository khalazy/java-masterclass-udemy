public class Test {
    public static void main(String[] args) {

        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calc = new Calculator(floor, carpet);

        System.out.println("total = " + calc.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calc = new Calculator(floor, carpet);

        System.out.println("total = " + calc.getTotalCost());

    }
}
