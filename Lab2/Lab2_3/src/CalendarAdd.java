
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarAdd {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        GregorianCalendar myBirthday = new GregorianCalendar(2000,Calendar.JULY,20);
        now.add(Calendar.DAY_OF_MONTH,100);
        myBirthday.add(Calendar.DAY_OF_MONTH,10000);
        int nowDay = now.get(Calendar.DAY_OF_WEEK);
        int nowDayMonth = now.get(Calendar.DAY_OF_MONTH);
        int nowMonth = now.get(Calendar.MONTH);
        int nowYear = now.get(Calendar.YEAR);
        int myBirthdayDay = now.get(Calendar.DAY_OF_WEEK);
        int myBirthdayDayMonth = now.get(Calendar.DAY_OF_MONTH);
        int myBirthdayMonth = now.get(Calendar.MONTH);
        int myBirthdayYear = myBirthday.get(Calendar.YEAR);
        System.out.println(nowDay+" "+nowDayMonth+" "+nowMonth+" "+nowYear);
        System.out.println(myBirthdayDay+" "+myBirthdayDayMonth+" "+myBirthdayMonth+" "+myBirthdayYear);
    }
    
}
