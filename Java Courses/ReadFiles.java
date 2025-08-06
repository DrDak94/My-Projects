import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options).
        
        // 1. BufferedReader + FileReader = best for reading text files line-by-line.
        // 2. FileInputStream = best for binary files (e.g. images, audio files).
        // 3. RandomAccessFile = best for read/write specific portions of a large file.

        String filePath = "C:\\Users\\david\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file location");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}
