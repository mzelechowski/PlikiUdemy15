import java.io.*;

public class P207BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader("files\\207multiline.txt"));
            String str=null;
            while((str=br.readLine())!=null){
            System.out.println(str);
        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) br.close();
        }
    }
}
