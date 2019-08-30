import java.time.Clock;
import java.time.Duration;

public class myClock {
    // Attributes:
    // Example: final int a = 1;

    public static void main(String[] args) {
        System.out.println("I live!\n");

        Clock c = Clock.systemUTC();  
        Duration d = Duration.ofHours(5);  
        Clock clock = Clock.offset(c, d);    
        System.out.println(clock.instant());  
        
    }
}