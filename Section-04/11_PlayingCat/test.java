public class Test {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if((!summer) && (temperature >= 25) && (temperature <= 35)) {
            return true;
        } else if((summer) && (temperature >= 25) && (temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
