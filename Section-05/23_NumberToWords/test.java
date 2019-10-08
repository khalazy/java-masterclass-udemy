public class Test {
    public static void main(String[] args) {
        numberToWords(0);
        System.out.println();
        numberToWords(987654321);
        System.out.println();
        numberToWords(123123123);
        System.out.println();
        numberToWords(8675309);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int newNumber = reverse(number);
        int digitCountOriginal = getDigitCount(number);
        int digitCountNew = getDigitCount(newNumber);
        int digitDiff;

        if(newNumber == 0) {
            System.out.println("Zero");
        }

        while(newNumber != 0) {

            int digitVal = newNumber % 10;

            switch (digitVal) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            newNumber /= 10;
        }

        if(digitCountOriginal != digitCountNew) {
            digitDiff = digitCountOriginal - digitCountNew;
            for(int i = 0; i < digitDiff; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int lastNum;

        while(number != 0) {
            lastNum = number % 10;
            reverseNum *= 10;
            reverseNum += lastNum;
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        int count = 0;

        if(number == 0) {
            count++;
        }

        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
