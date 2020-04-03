import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Hello Violina and Maria");

        printWriter.close();
    }
}
