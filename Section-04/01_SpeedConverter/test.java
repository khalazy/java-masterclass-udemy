public class Test {
    public static void main(String[] args) {

        double result = toMilesPerHour(10.25);
        System.out.println(result);
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double milesVal = 1.609;
        double result;

        if(kilometersPerHour >= 0) {
            result = kilometersPerHour / milesVal;
            return Math.round(result);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        double milesPerHour;

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            milesPerHour = (toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
