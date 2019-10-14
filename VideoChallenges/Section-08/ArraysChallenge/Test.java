import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getArray(5);
        System.out.println("***UNSORTED ARRAY***");
        printArray(array);
        sortArray(array);
        System.out.println("***SORTED ARRAY***");
        printArray(array);
    }

    public static int[] getArray(int number) {
        System.out.println("Enter digits: \r");
        int[] newArray = new int[number];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortArray(int[] array) {
        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
