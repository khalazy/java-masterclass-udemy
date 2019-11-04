class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel <= 100 && tonerLevel >= 0) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    int getTonerLevel() {
        return tonerLevel;
    }

    int getPagesPrinted() {
        return pagesPrinted;
    }

    boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    int fillToner(int tonerAmount) {
        if(tonerAmount <= 100 && tonerAmount >= 0) {
            if(this.tonerLevel + tonerAmount > 100) {
                return - 1;
            }
            this.tonerLevel += tonerAmount;
        }
        return this.tonerLevel;
    }

    int printPages(int pages) {
        if(this.duplexPrinter){
            this.pagesPrinted += (pages / 2) + (pages % 2);
        } else {
            this.pagesPrinted += pages;
        }
        return this.pagesPrinted;
    }
}
