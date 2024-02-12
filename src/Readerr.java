import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Readerr {

    public static void usingCharArrayReader() {

        char[] c1 = { 'a', 'b', 'c' };

        CharArrayReader chr = new CharArrayReader(c1);
        int val;
        try {
            while ((val = chr.read()) != -1) {
                System.out.println((char) val);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void usingInputStreamReader() {

        byte[] c1 = { 'a', 'b', 'c' };

        InputStreamReader chr = new InputStreamReader(new ByteArrayInputStream(c1));
        int val;
        try {
            while ((val = chr.read()) != -1) {
                System.out.println((char) val);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // usingCharArrayReader();
        // usingInputStreamReader();

    }
}
