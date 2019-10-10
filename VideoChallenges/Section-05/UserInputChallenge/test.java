import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        while(counter <= 10) {
            System.out.println("Enter a value for #" + counter);
            boolean hasNextInt = input.hasNextInt();

            if(hasNextInt) {
                int userVal = input.nextInt();
                sum += userVal;
                counter++;
            } else {
                System.out.println("Invalid Value");
            }
            input.nextLine();
        }
        input.close();
        System.out.println("The sum is: " + sum);
    }
}
