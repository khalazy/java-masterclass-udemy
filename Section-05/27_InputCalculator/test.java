import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while(true) {

            boolean hasNextInt = input.hasNextInt();

            if(hasNextInt) {
                int userInput = input.nextInt();
                counter++; // how many integers the user has entered
                sum += userInput;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
                input.close();
                break;
            }
            input.nextLine();
        }
    }
}
