import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,fact=1;
        System.out.println("Enter the number :");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=1;i<=num;++i){
            fact*=i;
        }
        System.out.println("The fact of " +num+ " is : " +fact);
    }
}