class Room {
    private Walls walls;
    private Dimensions dimensions;
    private Bed bed;
    private Television television;

    Room(Walls walls, Dimensions dimensions, Bed bed, Television television) {
        this.walls = walls;
        this.dimensions = dimensions;
        this.bed = bed;
        this.television = television;
    }

    String getWallColor() {
        return walls.getColor();
    }

    int getArea() {
        return dimensions.getArea(dimensions.getLength(), dimensions.getWidth());
    }

    int getResolution() {
        return television.getResolution();
    }

    int getTelevisionSize() {
        return television.getSize();
    }

    int getPillows() {
        return bed.getPillows();
    }

    String getBedSize() {
        return bed.getSize();
    }

    int getRoomLength() {
        return dimensions.getLength();
    }

    int getRoomWidth() {
        return dimensions.getWidth();
    }
}
