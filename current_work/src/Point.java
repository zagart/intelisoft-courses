/**
 * Created by USER on 18.05.2016.
 */
public class Point {

    private int x = 0;
    private int y = 0;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void getPointQuarter() {
        String msg = "";

        if (x == 0 && y == 0 ) {
            msg = "Point is zero.";
        } else if (x == 0) {
            msg = "X-axis.";
        } else if (y == 0) {
            msg = "Y-axis.";
        } else if (x > 0 && y > 0) {
            msg = "First quarter.";
        } else if (x < 0 && y > 0) {
            msg = "Second quarter.";
        } else if (x < 0 && y < 0) {
            msg = "Third quarter.";
        } else if (x > 0 && y < 0) {
            msg = "Fourth quarter.";
        }
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
