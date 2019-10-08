public class Test {
    public static void main(String[] args) {
        System.out.println("Expected: false Result: " + canPack(2, 0, 9)); // false
        System.out.println("Expected: true Result: " + canPack(1, 5, 9)); // true
        System.out.println("Expected: false Result: " + canPack(1, 0, 4)); // false
        System.out.println("Expected: true Result: " + canPack(1, 0, 5)); // true
        System.out.println("Expected: true Result: " + canPack(0, 5, 4)); // true
        System.out.println("Expected: true Result: " + canPack(2, 2, 11)); // true
        System.out.println("Expected: false Result: " + canPack(-3, 2, 12)); // false
        System.out.println("Expected: false Result: " + canPack(1, 0, 6)); // false
        System.out.println("Expected: false Result: " + canPack(0, 5, 6)); // false
        System.out.println("Expected: true Result: " + canPack(2, 1, 5)); // true
        System.out.println("Expected: false Result: " + canPack(5, 3, 24)); // false
        System.out.println("Expected: true Result: " + canPack(4, 18, 19)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        // bigCount = 5 kilos
        // smallCount = 1 kilo

        int bigBags = bigCount * 5;
        int sum = bigBags + smallCount;
        int leftOver = goal % 5;

        if(sum < goal) {
            return false;
        }
        return smallCount >= leftOver;
    }
}
