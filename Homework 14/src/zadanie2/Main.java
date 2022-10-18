package zadanie2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_WEEK, 3);
        calendar.add(Calendar.WEEK_OF_MONTH,+1);



        Date date = calendar.getTime();
        System.out.println(date);


    }
}
