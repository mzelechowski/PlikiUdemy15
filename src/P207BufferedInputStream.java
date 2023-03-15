import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P207BufferedInputStream {
    public static void main(String[] args) throws Exception {
        BufferedInputStream in = null;

        try {
            in = new BufferedInputStream(
                    new FileInputStream("testBuf.txt"));
            int v = 0;
            while ((v = in.read()) != -1) {
                System.out.print((char) v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}
