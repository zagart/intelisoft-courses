/**
 * Created by USER on 23.05.2016.
 */
public class LogicBlock {

    private int i = 0;

    public LogicBlock() {
        System.out.println(getI());
        System.out.println("constructor");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    {
        System.out.println("logic");
    }

    static {
        System.out.println("static");
    }


}
