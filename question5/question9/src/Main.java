import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        double deter;
        Scanner p=new Scanner(System.in);
        System.out.println("What's the value of a :");
        a = p.nextDouble();
        System.out.println("What's the value of b :");
        b = p.nextDouble();
        System.out.println("What's the value of c :");
        c= p.nextDouble();
        deter = b*b-4*a*c;
        double root1 = 0,root2 = 0;
        if (deter>0){
            root1 = (-b+(Math.sqrt(deter)))/2*a;
            root2 = (-b-(Math.sqrt(deter)))/2*a;
            System.out.println(String.format("The first root is :" +"%.2f",+root1) + String.format("\nThe second root is :"  +"%.2f",+root2));
        }
        else if (deter == 0){
            root1=root2=-b/2*a;
            System.out.println("The first root is :" +root1+ "\nThe second root is :" +root2);
        }
        else {
            System.out.println("The roots are imaginary");
        }

    }
}