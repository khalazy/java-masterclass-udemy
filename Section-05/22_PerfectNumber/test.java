public class Test {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {

        int storedDivisor = 0;

        if(number < 1) {
            return false;
        }

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                storedDivisor += i;
            }
        }
        return storedDivisor == number;
    }
}
