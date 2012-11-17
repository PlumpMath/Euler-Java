//How many months started on a sunday in the 20th century?

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class P19 {
  public static void main (String[] args) {
    
    GregorianCalendar currentDate = new GregorianCalendar(1901, 0, 1);
    GregorianCalendar endDate = new GregorianCalendar(2000, 11, 31);
    Date todayDate = currentDate.getTime();
    Date lastDate = endDate.getTime();
    
    int totalSundays = 0;
    
    while (todayDate.before(lastDate)){
      currentDate.add(GregorianCalendar.MONTH, 1);
      
      if (currentDate.get(Calendar.DAY_OF_WEEK)==1){
        totalSundays++;
      }
      todayDate = currentDate.getTime();
    }
    System.out.println(totalSundays);
  }
}