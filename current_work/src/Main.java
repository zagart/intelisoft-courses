import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String...args) {

        Calendar cal = new GregorianCalendar(2010, Calendar.JULY, 10);
        SimpleDateFormat format = new SimpleDateFormat(" d MMMM YYYY");

        System.out.println(format.format(cal.getTime()));

    }


}
