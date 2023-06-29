package reading_and_writing_files.q6;

import java.io.FileWriter;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write("Hello, World!");
        } catch (IOException e) {
            // Handle exception
        }
    }
    
}
