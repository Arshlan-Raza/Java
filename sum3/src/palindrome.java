import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n){
        int sum =0 ;
        int r=0;

        while(n>0){
               r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum!=n){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        int num=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        System.out.println(isPalindrome(num));
    }

}