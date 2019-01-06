import java.util.Scanner;

public class IndexOfLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                            'p','q','r','s','t','u','v','w','x','y','z'};


        for (int i = 0; i < input.length() ; i++) {

            char symbol = input.charAt(i);

            int position = new String(letters).indexOf(symbol);

            System.out.printf("%c -> %d%n",symbol,position);
        }

    }
}
