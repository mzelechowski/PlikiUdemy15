import java.util.Scanner;

public class P209ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz ilosc liczb do dodania: ");
        int numNumbers = scanner.nextInt();
        int sum=0;

        for (int i = 0; i < numNumbers; i++) {
            System.out.println("Wprowadź kolejną liczbę całkowitą do doatania: ");
            sum+=scanner.nextInt();
        }
        System.out.println("Suma liczb wynosi: "+ sum);
    }
}
