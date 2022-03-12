package CodingExercises;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extrabuckets) {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extrabuckets<0 )
            return -1;
        return (int)Math.ceil(((width*height)-(areaPerBucket*extrabuckets))/areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0 || height<=0 || areaPerBucket<=0 )
            return -1;
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<=0 || areaPerBucket<=0 )
            return -1;
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
