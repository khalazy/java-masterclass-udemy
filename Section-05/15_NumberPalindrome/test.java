public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1223));
    }

    public static boolean isPalindrome(int number) {

        int startNumber = number;
        int reverseVal = 0;
        int lastNumber;

        while(number != 0) {

            lastNumber = number % 10;
            reverseVal *= 10;
            reverseVal += lastNumber;
            number /= 10;

        }
        return reverseVal == startNumber;
    }
}
