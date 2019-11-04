class Dimensions {
    private int length;
    private int width;

    Dimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getLength() {
        return length;
    }

    int getWidth() {
        return width;
    }

    int getArea(int length, int width) {
        return getWidth() * getLength();
    }
}
