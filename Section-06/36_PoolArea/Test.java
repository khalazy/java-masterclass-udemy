public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("width = " + rectangle.getWidth());
        System.out.println("length = " + rectangle.getLength());
        System.out.println("area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("width = " + cuboid.getWidth());
        System.out.println("length = " + cuboid.getLength());
        System.out.println("height = " + cuboid.getHeight());
        System.out.println("area = " + cuboid.getVolume());
    }
}
