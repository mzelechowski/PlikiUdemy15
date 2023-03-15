import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class P211ObjectOutputStreamSerialization {
    public static void main(String[] args)
            throws IOException {
        CarObject car1 = new CarObject("Ford", "Mustnag", 1980, 200);
        CarObject car2 = new CarObject("Dodge", "Mustnag", 1980, 200);
        CarObject car3 = new CarObject("Fiat", "Mustnag", 1980, 200);
        CarObject car4 = new CarObject("FSO", "Mustnag", 1980, 200);
        ArrayList<CarObject> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        for (CarObject c : cars) {
            System.out.println(c);
        }
        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("files\\cars.dat")));
        for (CarObject c : cars) {
            out.writeObject(c);
        }
        out.flush();
        out.close();
    }
}
