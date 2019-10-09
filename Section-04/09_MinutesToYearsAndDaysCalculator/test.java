public class Test {
    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int leftOverDays = days % 365;

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + leftOverDays + " d");
        }
    }
}
