import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st, 2nd and 3rd number : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a > b && b > c ){
            System.out.println("Decreasing Order");
        }
        else if (a < b && b < c) {
            System.out.println(" Increasing Order ");
        }
        else{
            System.out.println("Neither Increasing Nor Decreasing");
        }
    }
}