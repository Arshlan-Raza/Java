import java.util.Scanner;

class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number) {

        if (number <= 0 || number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;

                }
            }
            return number;
        }
    }
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = n.nextInt();
        int res=getLargestPrime(number);
        System.out.println(res);
    }
}