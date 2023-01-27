import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mathCal[] = {"+", "-", "*", "/"};
        double add = 0d, subst = 0d, multi = 1d, div = 1d;
        double num2 = 0d;
        int len = mathCal.length;

        System.out.println("Enter the Mathematical operator you want to perform");
        Scanner sy = new Scanner(System.in);
        String symbol = sy.nextLine();
        System.out.println("Enter how many numbers you want");
        Scanner st = new Scanner(System.in);
        int noOfNumb = st.nextInt();
        for (int i = 1; i <= len; ++i) {
            for (int j = 1; j <= noOfNumb; ++j) {
                System.out.println("Enter the " + j + " number");
                Scanner num = new Scanner(System.in);
                num2 = num.nextDouble();
                }
            if (symbol == mathCal[i]) {
                add += num2;
                System.out.println("The addition of " + noOfNumb + " is: " + add);
                    break;
            } else if (symbol == mathCal[i]) {
                subst -= num2;
                System.out.println("The addition of " + noOfNumb + " number is: " + subst);
                    break;
            } else if (symbol == mathCal[i]) {
                multi *= num2;
                System.out.println("The addition of " + noOfNumb + " number is: " + multi);
                    break;
            } else {
                div /= num2;
                System.out.println("The addition of " + noOfNumb + " number is: " + div);
                    break;


            }
        }

    }
}