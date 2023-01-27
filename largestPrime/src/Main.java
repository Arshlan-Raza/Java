import java.util.Scanner;

class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        if(number<=0||number<=1){
            return -1;
        }
        for(int i=2;i<number;++i){
            while(number%i==0){
                number=number/i;
            }
        }
        return number;

    }
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = n.nextInt();
        int res=getLargestPrime(number);
        System.out.println(res);
    }
}