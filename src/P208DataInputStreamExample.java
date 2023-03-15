import java.io.*;

public class P208DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream input = null;
        try {
            input = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\testData208.dat")));
            String str = input.readUTF();
            System.out.println(str);

            short shortNum = input.readShort();
            System.out.println(shortNum);

            long longNum= input.readLong();
            System.out.println(longNum);

            float floatNum=input.readFloat();
            System.out.println(floatNum);

            double doubleNum=input.readDouble();
            System.out.println(doubleNum);

            byte byteNum=input.readByte();
            System.out.println(byteNum);

            char charSign=input.readChar();
            System.out.println(charSign);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) input.close();
        }
    }
}
