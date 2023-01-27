import java.util.Scanner;

 class isEvenNumber {
    static boolean isEvenNumber(int number){
        int count =1;
            if(number%2==0){
                return true;
            }
            else
                return false;
        }
    public static void main(String[] args){
              Scanner you = new Scanner(System.in);
        System.out.println("Enter the number");;
              int number = you.nextInt();
        System.out.println(isEvenNumber(number));
    }
    }

