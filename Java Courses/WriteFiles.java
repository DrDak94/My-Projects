import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options).

        // 1. FileWriter = good for small or medium-sized text files.
        // 2. BufferedWriter = better performance for large amount of text.
        // 3. PrintWriter = best for structured data, like reports of logs.
        // 4. FileOutputStream = best for binary files (e.g. images, audio files).

        String filePath = "C:\\Users\\david\\Desktop\\test.txt";
        String textContent = """
        This is a test file.
        This is another line.
        This is yet another line.
        """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        };

    }
}
