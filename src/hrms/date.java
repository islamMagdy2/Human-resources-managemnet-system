
package hrms;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class date{
    private String y,m,d,hour,minute,date,time;
   
    private final Calendar cal=new GregorianCalendar();

    /**
     *function to get day
     * @return
     */
    public String day(){
        d = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
        return d;
    }
    
    /**
     *function to get month
     * @return
     */
    public String month(){
        m=Integer.toString(cal.get(Calendar.MONTH)+1);
        return m;
    }
    
    /**
     *function to get year
     * @return
     */
    public String year(){
        y=Integer.toString(cal.get(Calendar.YEAR));
        return y;
    }

    /**
     *function to date
     * @return
     */
    public String date(){
        d = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
        m=Integer.toString(cal.get(Calendar.MONTH)+1);
        y=Integer.toString(cal.get(Calendar.YEAR));
        date=d+"/"+m+"/"+y;
       System.out.println(date);
        return date; 
    }

    /**
     *function to get time
     * @return
     */
    public String time(){
        hour=Integer.toString(cal.get(Calendar.HOUR_OF_DAY));
        minute=Integer.toString(cal.get(Calendar.MINUTE));
        time=hour+":"+minute;
        System.out.println(time);
        return time;
    }
    
}
