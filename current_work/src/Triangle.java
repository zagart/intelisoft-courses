/**
 * Created by USER on 18.05.2016.
 */
public class Triangle {

    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle() {

    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {

        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {

        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
