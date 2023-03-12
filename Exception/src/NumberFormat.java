import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            int n = Integer.parseInt(s.nextLine());
            if(99 % n == 0){
                System.out.println("99 is factor of : "+n);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException ef){
            System.out.println(ef);
        }
    }
}