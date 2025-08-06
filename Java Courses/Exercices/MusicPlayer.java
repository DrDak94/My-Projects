package Exercices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
    public static void main(String[] args) {

        // Music Player Program
        // How to play audio with Java (.wav, .au, .aiff)
        
        String filePath = "C:\\Users\\david\\Desktop\\Java Courses\\Exercices\\The-Door.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            
            while(!response.equals("Q")){
                System.out.println("Press P to play, S to stop, R to reset or Q to quit.");
                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio format not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Thanks for playing!");
        }
    }
}
