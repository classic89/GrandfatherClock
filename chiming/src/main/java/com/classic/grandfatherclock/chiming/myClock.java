import java.time.Clock;
import java.time.Instant;
import java.time.Duration;

public class myClock {
    private Instant alarmInstant;
    private boolean isAlarmOn;


    /**
     * @param alarmInstant the alarmInstant to set
     */
    public void setAlarmInstant(Instant alarmInstant) {
        this.alarmInstant = alarmInstant;
    }
    /**
     * @param isAlarmOn the isAlarmOn to set
     */
    public void setAlarmOn(boolean b) {
        this.isAlarmOn = b;
    }
        /**
     * @return the alarmInstant
     */
    public Instant getAlarmInstant() {
        return alarmInstant;
    }

    public boolean getIsAlarmOn() {
        return isAlarmOn;
    }
    public String getCurrentAlarmTime(Clock c, Instant i)
    {
        return "\nThe current time is " + c.instant() + 
                "\nThe alarm is set to " + this.getAlarmInstant() +
                "\nIs the Alarm On? "+ this.getIsAlarmOn();
    }

    public myClock(Instant i, boolean b) {
        super();
        setAlarmInstant(i);
        setAlarmOn(b);
    }
    
    public static void main(String[] args) {
        System.out.println("I live!\n");
        System.out.println(); 
        Clock c = Clock.systemUTC(); 
        Duration d = Duration.ofHours(5);  
        Instant i = Clock.offset(c, d).instant();
        myClock mc = new myClock(i, true);
        System.out.print(mc.getCurrentAlarmTime(c,i));
    }
}