import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double celsius,farheint;
        System.out.println("Enter the temperature in celsius :");
        Scanner s = new Scanner(System.in);
        celsius = s.nextDouble();
        farheint  = (celsius*1.8)+32;
        System.out.println (String.format("The temperature in farheint is : " + "%.3f", farheint));


    }
}