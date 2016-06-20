import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by USER on 18.05.2016.
 */
public class Point {

    final private int x;
    final private int y;

    /**
     public Point() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter X please: ");
     x = scanner.nextInt();
     System.out.println("Enter Y please: ");
     y = scanner.nextInt();
     }
     */


    public int getY() {
        return y;
    }

//    public void setY(int y) {
//        this.y = y;
//    }

    public int getX() {

        return x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    //    public void setX(int x) {
//        this.x = x;
//    }

    public void getQuarterOfPoint() {
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

    public boolean isPointFar(Point point) {
        if ((this.x > point.getX()) && (this.y > point.getY())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
