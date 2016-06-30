/**
 * Created by USER on 23.05.2016.
 */
public class ImmutablePoint {

    final private int x;
    final private int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
