public class Test {
    public static void main(String[] args) {

        printSquareStar(8);
        System.out.println();
        printSquareStar(5);
        System.out.println();
        printSquareStar(2); // print Invalid Value
    }

    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            // "i" is the rows, "x" is the columns
            for (int i = 1; i <= number; i++) {
                for (int x = 1; x <= number; x++) {

                    // print * on first & last row
                    // print * on first & last column
                    // print * on column that equals number - i + 1
                    // print * where the row number equals column number
                    if (i == 1 || i == number || x == 1 || x == number || x == number - i + 1 || i == x) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

