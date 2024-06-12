import java.util.Arrays;

public class Box implements Comparable<Box> {
    int width, height, length;
    
    public Box(int width, int height, int length) {
        int[] dimensions = {width, height, length};
        Arrays.sort(dimensions);
        this.width = dimensions[0];
        this.height = dimensions[1];
        this.length = dimensions[2];
    }
    
    public boolean canNestInside(Box otherBox) {
        return this.width < otherBox.width && this.height < otherBox.height && this.length < otherBox.length;
    }

    @Override
    public int compareTo(Box other) {
        if (this.width != other.width) {
            return this.width - other.width;
        } else if (this.height != other.height) {
            return this.height - other.height;
        } else {
            return this.length - other.length;
        }
    }
}
