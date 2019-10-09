public class Test {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int mbVal = 1024;
        int megaBytes;
        int remainingKilobytes;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            megaBytes = kiloBytes / mbVal;
            remainingKilobytes = kiloBytes % mbVal;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB" + " and " + remainingKilobytes + " KB");
        }
    }
}
