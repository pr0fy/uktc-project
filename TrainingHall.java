import java.util.Scanner;

public class TrainingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        int hDesk = 120;
        int wDesk = 70;
        int missDesk = 3;
        int hall = 100;

        double rowsDesk = Math.floor( (h * 100) / hDesk);
        double seatsDesk = Math.floor( ((w * 100) - hall) / wDesk);

        double allDesk = (int)((rowsDesk * seatsDesk) - missDesk);

        System.out.printf("%.0f",allDesk);
    }
}