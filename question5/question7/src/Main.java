import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum,secondNum,gcd=0;
        System.out.println("Enter the first number :");
        Scanner f= new Scanner(System.in);
        firstNum = f.nextInt();
        System.out.println("Enter the second number :");
        secondNum = f.nextInt();
        for(int i =1; i<=firstNum && i<=secondNum;++i){
            if(firstNum%i==0 && secondNum%i==0){
                gcd=i;
            }
        }
        System.out.println(" The GCD of " +firstNum+ " and " +secondNum+ " is " +gcd);
    }
}