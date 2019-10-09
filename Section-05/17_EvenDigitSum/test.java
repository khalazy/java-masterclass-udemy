public class Test {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {

        int compareDigit;
        int evenSum = 0;

        if(number < 0) {
            return -1;
        }

        while(number > 0) {
            compareDigit = number % 10;

            if(compareDigit % 2 == 0) {
                evenSum += compareDigit;
            }
            number /= 10;
        }
        return evenSum;
    }
}
