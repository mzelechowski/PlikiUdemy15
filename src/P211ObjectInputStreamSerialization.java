import java.io.*;

public class P211ObjectInputStreamSerialization {
    public static void main(String[] args)
            throws IOException {
        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("files\\cars.dat")));
        try {
            while (true) {
                CarObject car = (CarObject) in.readObject();
                car.setAutoId();
                System.out.println(car);
            }

        } catch (EOFException e) {
            // e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (in != null) in.close();
        }

    }
}
