public class Test {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(sumOdd(1, 100));
    }

    private static boolean isOdd(int number) {

        if(number < 0) {
            return false;
        } else if(number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int sumOdd(int start, int end) {

        int sum = 0;

        if((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
