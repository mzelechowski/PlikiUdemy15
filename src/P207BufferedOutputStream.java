import java.io.*;

public class P207BufferedOutputStream {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream out = null;
        String str = "Testowy string do zapisu.";
        char chars[] = str.toCharArray();
        try {
            out = new BufferedOutputStream(
                    new FileOutputStream("files\\testBuf.txt"));
            for(char c:chars){
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}
