import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        int money = 0;
        int moneySpend = 0;
        int toyCount = 0;
        double totalMoneySpend = 0.0;
        double n = 0.0;
        double m = 0.0;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                money += 10;
                moneySpend += money - 1;
            }
            else {
                toyCount++;
            }
        }

        double moneyFromToys = toyCount * toyPrice;
        totalMoneySpend = moneySpend + moneyFromToys;

        if (totalMoneySpend >= washingMachine) {
            n = totalMoneySpend - washingMachine;
            System.out.printf("Yes! %.2f", n);
        } else {
            m = washingMachine - totalMoneySpend;
            System.out.printf("No! %.2f", m);
        }
    }
}