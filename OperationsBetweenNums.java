import java.util.Scanner;

public class OperationsBetweenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        double result = 0.0;

        switch (sign) {
            case '+':
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even",num1,num2,result);
                }
                else {
                    System.out.printf("%d + %d = %.0f - odd",num1,num2,result);
                }
                break;

            case '-':
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even",num1,num2,result);
                }
                else {
                    System.out.printf("%d - %d = %.0f - odd",num1,num2,result);
                }
                break;

            case '*':
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even",num1,num2,result);
                }
                else {
                    System.out.printf("%d * %d = %.0f - odd",num1,num2,result);
                }
                break;

            case '/':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero",num1);
                }
                else {
                    result = num1 * 1.0 / num2;
                    System.out.printf("%d / %d = %.2f",num1,num2,result);
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero",num1);
                }
                else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %.0f",num1,num2,result);
                }
                break;
        }
    }
}
