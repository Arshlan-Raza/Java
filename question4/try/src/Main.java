import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int range , firstTerm = 0, secondTerm = 1;
        System.out.println("Enter the range of fibonacci sequence :");
        Scanner s = new Scanner(System.in);
        range = s.nextInt();
        System.out.println("Fibonacci Series till " + range + " terms:");

        for (int i = 1; i <= range; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int fib = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = fib;
        }
    }
}