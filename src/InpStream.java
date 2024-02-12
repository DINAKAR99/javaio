import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InpStream {
    public static void usingFileinputStream() {

        File file1 = new File("src\\text.txt");
        try (FileInputStream f1 = new FileInputStream(file1)) {

            byte[] b = new byte[10];

            int val;

            while ((val = f1.read()) != -1) {

                System.out.println((char) val);

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        usingFileinputStream();

    }
}
