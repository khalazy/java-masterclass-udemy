public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(
                new Walls("blue"),
                new Dimensions(60, 80),
                new Bed("Queen", 2),
                new Television(65, 1080));

        System.out.println("The colors of the walls are " + room1.getWallColor() + ".");
        System.out.println("The dimensions of the room are " + room1.getRoomLength() + "ft x " +
                           room1.getRoomWidth() + "ft.");
        System.out.println("The size of the bed is " + room1.getBedSize() + ".");
        System.out.println("The bed has " + room1.getPillows() + " pillows.");
        System.out.println("The size of the TV is " + room1.getTelevisionSize() + " inches.");
        System.out.println("The TV has a resolution of " + room1.getResolution() + "p.");
        System.out.println("The area of the room is " + room1.getArea() + " sqft.");
    }
}
