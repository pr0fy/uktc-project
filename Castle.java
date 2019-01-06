import java.util.Scanner;

public class Castle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Top

        if (n<=4) {
            System.out.print("/" + repeatStr("^", n / 2) +
                    "\\" + "/" + repeatStr("^", n / 2) + "\\");
        }
        else {
            System.out.print("/" + repeatStr("^", n / 2) +
                    "\\"+ repeatStr("_",n/2)+ "/" + repeatStr("^", n / 2) + "\\");
        }

        System.out.println();
        //Middle

        if (n<=4){

            for (int i = 0; i <=n-2 ; i++) {
                System.out.println("|" + repeatStr(" ", (2 * n) - 2) + "|");
            }
        }
        else{
            for (int i = 0; i <=n-2 ; i++) {

                if (i+1 == n-1){
                    System.out.println("|"+repeatStr(" ", n / 2+1) +
                            repeatStr("_",n/2)+" "+repeatStr(" ", n / 2)+"|");
                }
                else {
                    System.out.println("|" + repeatStr(" ", (2 * n) - 2) + "|");
                }
            }
        }

        //Bottom

        if (n<=4) {
            System.out.print("\\" + repeatStr("_", n / 2)
                    + "/" + "\\" + repeatStr("_", n / 2) + "/");
        }
        else {
            System.out.print("\\" + repeatStr("_", n / 2)
                    + "/"+ repeatStr(" ",n/2)+ "\\"+ repeatStr("_", n / 2)+"|");
        }

    }
    static String repeatStr (String text,int count){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <count ; i++) {

            result.append(text);
        }
        return result.toString();
    }
}