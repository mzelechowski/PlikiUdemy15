import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P205PlikiWstep {
    public static void main(String[] args) throws IOException {

        //Zapisywanie do pliku
        FileOutputStream out = null;
        char chars[] = {'Q', 'W', 'E', 'R', 'T', 'Y'};

        try {
            out = new FileOutputStream("test.txt");
            for (char c : chars) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
// Odczytwanie pliku
        FileInputStream in = null;
        try {
            in = new FileInputStream("test.txt");
            int num = 0;
            while ((num = in.read()) != -1) {
                System.out.print((char) num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
        // kopiowanie pliku
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("test.txt");
            output = new FileOutputStream("copy.txt");
            int num = 0;
            while ((num = input.read()) != -1) {
                output.write(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) in.close();
            if (output != null) in.close();
        }
    }
}
