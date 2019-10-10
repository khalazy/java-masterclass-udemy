import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int tempMin = 0;

        while(true) {

            System.out.println("Enter number: ");
            boolean hasNextInt = input.hasNextInt();

            if(hasNextInt) {
                int userInput = input.nextInt();
                System.out.println("You entered: " + userInput);

                if(userInput > max) {
                    max = userInput;
                }

                if(tempMin < userInput) {
                    min = tempMin;
                }

                if(userInput < max) {
                    tempMin = userInput;
                }

            } else {
                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
                input.close();
                break;
            }
            input.nextLine();
        }
    }
}
