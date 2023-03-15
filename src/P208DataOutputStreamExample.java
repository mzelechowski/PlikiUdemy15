import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P208DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        try {
            out=new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\testData208.dat")));
        out.writeUTF("Testowy strumienń bianary");
        out.writeShort(3200);
        out.writeLong(1235468664L);
        out.writeFloat(23.56f);
        out.writeDouble(2374465.434d);
        out.writeByte(12);
        out.writeChar('A');
        out.flush();  // wymuszenie zapisu z bufora
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out!=null) out.close();
        }
    }
}
