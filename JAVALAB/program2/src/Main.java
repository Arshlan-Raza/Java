import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = s.nextInt();

        int i = 0;
        while(i<rows){
            int j = 1;
            int c = 1;

            while(j < (rows - i)){
                System.out.print(" ");
                j++;
            }

            int k = 0;

            while(k<=i){
                System.out.print(c+" ");
                c = c*(i - k)/(k + 1);
                k++;
            }

            System.out.println();
            i++;
        }


    }
}