import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double principle,rate;
        int time;
        double simpleInterest;
        System.out.println("Enter principle amount :");
        Scanner p=new Scanner(System.in);
        principle=p.nextDouble();
        System.out.println("Enter the rate of interest :");
        Scanner s=new Scanner(System.in);
        rate=s.nextDouble();
        System.out.println("Enter the time in years :");
        time= p.nextInt();
        simpleInterest=(principle*rate*time)/100;
        System.out.println("The simple interest is : " +simpleInterest);


    }
}