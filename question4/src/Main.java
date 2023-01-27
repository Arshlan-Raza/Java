import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int range,first=0,second=1,fib=0;
        System.out.println("Enter the range of fibonacci sequence :");
        Scanner s=new Scanner(System.in);
        range = s.nextInt();
        int i=0;
        while(i<range){
            fib=first+second;
            first=second;
            second=fib;
            ++i;
        }
        System.out.println("Fibonacci Sequence is : " );
    }
}