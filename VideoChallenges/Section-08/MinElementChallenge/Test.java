import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(10)));
    }

    public static int[] readIntegers(int number) {
       int[] array = new int[number];

       System.out.println("Enter digits: \r");
       for(int i = 0; i < array.length; i++) {
           array[i] = scanner.nextInt();
       }
       return array;
    }

    public static int findMin(int[] array) {
        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array[array.length - 1];
    }
}
