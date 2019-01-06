import java.util.Scanner;

public class SpecialNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i < 9999; i++) {

            int firstNum = i / 1000;
            int secondNum = (i / 100) % 10;
            int thirdNum = (i / 10) % 10;
            int lastNum = i % 10;

            if (firstNum != 0 && secondNum != 0 && thirdNum != 0 && lastNum != 0) {

                if (n % firstNum == 0 && n % secondNum == 0 && n % thirdNum == 0 && n % lastNum == 0) {
                    System.out.print( "" + i + " ");
                }
            }
        }
    }
}