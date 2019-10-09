public class Test {
    public static void main(String[] args) {

        System.out.println(hasTeen(13,12,23));
        System.out.println(isTeen(19));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {

        if((age1 >= 13 && age1 <= 20) || (age2 >= 13 && age2 <= 20) || (age3 >= 13 && age3 <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {

        if(age >= 13 && age <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
