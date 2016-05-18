import java.text.SimpleDateFormat;

public class Main {

    public static void main(String...args) {

        User user = new User();
        user.setFirstName("Artiom");
        user.setLastName("Zagrebantsev");
        user.setSalary(10000);

        System.out.println(user);

        Point point = new Point();
        point.setX(10);
        point.setY(10);
        point.getQuarterOfPoint();

        Cat myCat = new Cat("Markiz","Black&White","Usual");
        System.out.println(myCat);

    }


}
