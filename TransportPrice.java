import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double sum = 0.0;

        if (n <= 20 && day.equals("day")) {
            sum = 0.70 + 0.79 * n;
        }
        else if (n <= 20 && day.equals("night")) {
            sum = 0.70 + 0.90 * n;
        }
        if (n > 20 && n < 100) {
            sum = n * 0.09;
        }
        else if (n >= 100) {
            sum = n * 0.06;
        }
        System.out.printf("%.2f", sum);
    }
}