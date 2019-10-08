public class Test {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(488));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        int compareVal1 = num1 % 10;
        int compareVal2 = num2 % 10;
        int compareVal3 = num3 % 10;

        if((compareVal1 == compareVal2) || (compareVal1 == compareVal3) ||
                (compareVal2 == compareVal3)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num1) {
        if(num1 < 10 || num1 > 1000) {
            return false;
        }
        return true;
    }
}
