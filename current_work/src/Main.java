import java.text.SimpleDateFormat;

public class Main {

    public static void main(String...args) {

        new LogicBlock();

        A a = new A();
        A a1 = new A();

        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sb.append("a");
        }
z
        long stop = System.currentTimeMillis();
        System.out.println(stop - start + "time" );


        a.setI(3);
        a1.setI(4);
        System.out.println(A.getI());

        B b = new B();

        User user = new User("login","password","email@mail.com");

        System.out.println(user);
        System.out.println(Math.sum(1,2));
        ImmutablePoint ipoint = new ImmutablePoint(10,15);
        ipoint.getY();
        ipoint.getX();
        System.out.println(ipoint);

    }


}
