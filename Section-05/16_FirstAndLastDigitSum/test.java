public class Test {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int lastDigit;
        int reverseNum = 0;
        int lastVal;

        if(number < 0) {
            return -1;
        }

        lastDigit = number % 10;

        while(number > 0) {
            lastVal = number % 10;
            reverseNum *= 10;
            reverseNum += lastVal;
            number /= 10;
            firstDigit = reverseNum % 10;
        }
        return lastDigit + firstDigit;
    }
}
