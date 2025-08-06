import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        // How to work with Dates & Times using Java.
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        // Custom format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom DateTime Object

        LocalDate myDate = LocalDate.of(2024, 12, 25);
        LocalDateTime myDateTime = LocalDateTime.of(2024, 12, 25, 12, 0, 0);

        System.out.println(myDate);
        System.out.println(myDateTime);

        
        LocalDateTime myDateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime myDateTime2 = LocalDateTime.of(2024, 1, 1, 0, 0, 0);

        if(myDateTime1.isBefore(myDateTime2)){
            System.out.println(myDateTime1 + " is earlier " + myDateTime2);
        }
        else if(myDateTime1.isAfter(myDateTime2)){
            System.out.println(myDateTime1 + " is later " + myDateTime2);
        }
        else if(myDateTime1.isEqual(myDateTime2)){
            System.out.println(myDateTime1 + " is equal to " + myDateTime2);
        }
        



    }
}
