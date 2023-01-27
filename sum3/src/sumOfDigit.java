import java.util.Scanner;

public class sumOfDigit {
    public static int sumDigits(int number){
        int sum=0;
        int remainder=0;

        if(number<=10){
            return -1;
        }
        else {
            while(number>0) {
                remainder = number % 10;

                sum+=remainder;
                number/=10;

            }


            return sum;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        int res = sumDigits(number);
        System.out.println("The sum of digits is : " + res);
        int remainder=0,sum2=0;
        while(res>0) {
            remainder = res % 10;

            sum2+=remainder;
            res/=10;
    }
        System.out.println("The sum of Output is : "+sum2);

    }
}
