import java.time.Clock;
import java.time.Duration;

public class myClock extends Clock{
    private int alarmHour;
    private int alarmMinute;
    private int alarmSecond;
    private boolean isAlarmOn;

    /**
     * @param alarmHour the alarmHour to set
     */
    public void setAlarmHour(int aH) {
        this.alarmHour = aH;
    }
    /**
     * @param alarmMinute the alarmMinute to set
     */
    public void setAlarmMinute(int aM) {
        this.alarmMinute = aM;
    }
    /**
     * @param alarmSecond the alarmSecond to set
     */
    public void setAlarmSecond(int aS) {
        this.alarmSecond = aS;
    }
    /**
     * @param isAlarmOn the isAlarmOn to set
     */
    public void setAlarmOn(boolean b) {
        this.isAlarmOn = b;
    }
    /**
     * @return the alarmHour
     */
    public int getAlarmHour() {
        return alarmHour;
    }
    /**
     * @return the alarmMinute
     */
    public int getAlarmMinute() {
        return alarmMinute;
    }
    /**
     * @return the alarmSecond
     */
    public int getAlarmSecond() {
        return alarmSecond;
    }
    public boolean getIsAlarmOn(){
        return isAlarmOn;
    }
    public String getCurrentAlarmTime()
    {
        return "The current time is " + getHour() + ":" + getMinute() + ":" +
            getSecond() + "\nThe alarm is set to " + getAlarmHour() + ":" +
                getAlarmMinute() + ":" + getAlarmSecond() +
                "\nThe Alarm is set to: "+getIsAlarmOn();
    }

    public myClock(int theHour, int theMinute, int theSecond, boolean b) {
        super();
        setAlarmHour(theHour);
        setAlarmMinute(theMinute);
        setAlarmSecond(theSecond);
        setBoolean(b);
    }

    public static void main(String[] args) {
        System.out.println("I live!\n");

        Clock c = Clock.systemUTC();  
        Duration d = Duration.ofHours(5);  
        Clock clock = Clock.offset(c, d);    
        System.out.println(clock.instant()); 
        myClock mc = myClock(0,0,0,TRUE);
        
        
    }
}