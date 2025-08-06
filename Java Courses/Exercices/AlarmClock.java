package Exercices;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        
        // Alarm Clock Program with Java

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\david\\Desktop\\Java Courses\\Exercices\\The-Door.wav";

        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid time format. Please use HH:mm:ss.");
            }
        }

        AlarmClockClass alarmClock = new AlarmClockClass(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();


        
    }
}
