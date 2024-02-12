import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void usingReader() {
        String s = "black montains and green grass in a green forest btwn the valleys";

        // Reader r1 = new StringReader(s);

        try (
                Reader r1 = new FileReader("bin\\text.txt")) {
            int val;

            while ((val = r1.read()) != -1) {

                char c = (char) val;

                System.out.println(c);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // file reader

    }

    public static void usingBufferedReader() {
        String s = "sidunsidad\nsdiqsdiuwq\nqdiuwdiwqd\twqdqwdaaba\baaa ";

        try (BufferedReader b1 = new BufferedReader(new FileReader("src\\text.txt"))) {
            String val;

            while ((val = b1.readLine()) != null) {

                System.out.println(val);

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void usingInputStream() throws IOException, InterruptedException {

        try (InputStream i1 = new FileInputStream("bin\\text.txt"))

        {
            int val;
            byte[] bytearray = new byte[20];

            try {
                val = i1.readNBytes(bytearray, 0, 10);

                System.out.println((new String(bytearray)));
                Thread.sleep(2000);
                while ((val = i1.readNBytes(bytearray, 0, 11)) != -1) {

                    System.out.println((new String(bytearray)));
                    Thread.sleep(2000);
                }

            }

            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

        usingInputStream();

    }

}
