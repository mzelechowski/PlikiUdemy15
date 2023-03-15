import java.io.*;

public class P207BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter("files\\207multiline.txt"));
            for (int i = 0; i < 5 ; i++) {
                bw.write("Testowy lancuch znaków: "+i+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) bw.close();
        }
    }
}
