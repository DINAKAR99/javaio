import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStream {

    public static void usingFileoutputStream() {

        File file1 = new File("src\\target.txt");

        try (FileOutputStream f1 = new FileOutputStream(file1)) {
            String n1 = "hello bhai";

            int b = 1000;

            byte[] bytes = String.valueOf(b).getBytes();

            f1.write(bytes);

            // f1.close();
            f1.write(bytes);
            f1.write(bytes);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        usingFileoutputStream();
    }

}
