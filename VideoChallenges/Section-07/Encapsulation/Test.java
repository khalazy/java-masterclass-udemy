public class Test {
    public static void main(String[] args) {

        Printer printer = new Printer(100, 0, true);
        System.out.println("Toner level is at: " + printer.getTonerLevel() + "%.");
        System.out.println(printer.getPagesPrinted() + " pages have been printed.");
        System.out.println("Is this printer a duplex printer? " + printer.isDuplexPrinter());

        System.out.println("New toner amount: " + printer.fillToner(20));
        System.out.println("Total pages printed: " + printer.printPages(5));
    }
}
