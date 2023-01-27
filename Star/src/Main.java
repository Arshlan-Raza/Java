import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        int i,j;
        for ( i=0;i<number;++i){
            for( j=0;j<=i;j++) {
                System.out.println("*");
            }
            System.out.println();
    }
}}
