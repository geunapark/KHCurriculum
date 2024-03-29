import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void output() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))) {
            bw.write("a"); 
            bw.write("A"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}