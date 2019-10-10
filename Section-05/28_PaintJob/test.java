public class Test {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // 3
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0)); // 2
        System.out.println(getBucketCount(7.32, 6.45, 2.22, 10)); // 12
        System.out.println(getBucketCount(1.22, 3.11, 2.5, 0)); // 2
        System.out.println("*************************************************");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // 14
        System.out.println("*************************************************");
        System.out.println(getBucketCount(3.4, 1.5)); // 3
        System.out.println(getBucketCount(6.26, 2.2)); // 3
        System.out.println(getBucketCount(3.26, 0.75)); // 5
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalAmount;
        double area = width * height;
        double bucketCoverage = areaPerBucket * extraBuckets;

        if(extraBuckets > 0) {
            totalAmount = (area - bucketCoverage) / areaPerBucket;
        } else {
            totalAmount = area / areaPerBucket;
        }

        return (int) Math.ceil(totalAmount);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        double totalAmount = area / areaPerBucket;

        return (int) Math.ceil(totalAmount);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalAmount = area / areaPerBucket;

        return (int) Math.ceil(totalAmount);
    }
}
