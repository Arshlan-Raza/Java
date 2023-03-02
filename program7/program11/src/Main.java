import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice ;
        do {
            System.out.println("***Main Menu***");
            System.out.println("1.Arithmetic Exception \n2.Arry Index out of Bound \n3.Number Format Exception" +
                    "\n4.String Out of Bound Exception \n5.Null Pointer Exception \n6.Exit");
            System.out.print("Enter your Choice : ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            switch(choice){
                case 1 ->Arithmetic_Exception();
                case 2 ->Array_Index_out_of_Bound();
                case 3 ->Number_Format_Exception();
                case 4 ->String_Out_of_Bound_Exception();
                case 5 ->Null_Pointer_Exception();
            }
        }
        while(choice!=6);
    }
    static void Arithmetic_Exception(){

        try{
            int n1 = 3,n2 = 0;
            int result = n1/n2;
            System.out.println("Result is : "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred ");
            System.out.println("System Message :"+e);
        }

    }
    static void Array_Index_out_of_Bound(){
        try{
            int[] arr = new int[6];
            arr[7] = 8;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred  ");
            System.out.println("System Message :"+e);
        }
    }
    static void Number_Format_Exception(){
        try{

            int inn = Integer.parseInt("XYZ");
            System.out.println(inn);

        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException Occurred  ");
            System.out.println("System Message :"+e);
        }
    }
    static void String_Out_of_Bound_Exception(){
        try{

            String str = "My Name is ";
            System.out.println("The length of string is : "+str.length());
            char c = str.charAt(40);
            System.out.println(c);

        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException Occurred  ");
            System.out.println("System Message :"+e);
        }
    }
    static void Null_Pointer_Exception(){
            try{
                String n = null;
                System.out.println("Length is : "+n.length());
            }
            catch(NullPointerException e){
                System.out.println("NullPointerException Occurred  ");
                System.out.println("System Message :"+e);
            }
    }
}

