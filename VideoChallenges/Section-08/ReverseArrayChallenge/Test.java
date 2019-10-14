import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("***ORIGINAL ARRAY***");
        System.out.println(Arrays.toString(array));
        System.out.println("***REVERSED ARRAY***");
        reverse(array);
    }

     public static void reverse(int[] array) {
        int length = array.length;
        int count = length - 1;
        int[] reverseArray = new int[length];

        for(int i = 0; i <= length - 1; i++) {
            reverseArray[count] = array[i];
            count--;
        }
         System.out.println(Arrays.toString(reverseArray));
     }
}
