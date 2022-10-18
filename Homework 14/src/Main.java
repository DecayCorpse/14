import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" year :");
        int year = scanner.nextInt();
        System.out.println(" month : ");
        int month = scanner.nextInt();
        System.out.println(" day : ");
        int day = scanner.nextInt();

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        Date date = calendar.getTime();

        System.out.println(date);

        if (calendar.DAY_OF_WEEK == 1) {
            System.out.println(" MO ");
        }
        if (calendar.DAY_OF_WEEK == 2) {
            System.out.println(" TY ");
        }
        if (calendar.DAY_OF_WEEK == 3) {
            System.out.println(" WE ");
        }
        if (calendar.DAY_OF_WEEK == 4) {
            System.out.println(" четверг короче ");
        }
        if (calendar.DAY_OF_WEEK == 5) {
            System.out.println(" FR ");
        }
        if (calendar.DAY_OF_WEEK == 6) {
            System.out.println(" SYT ");
        }
        if (calendar.DAY_OF_WEEK == 7) {
            System.out.println(" SU ");
        }

    }
}