import java.util.Scanner;

class Check {
    private double length = 8;
    private double breadth;
    void show(){
        System.out.println("The length is = "+length+"\nThe breadth is = "+breadth);
    }
    public double lenght(){
        return length;
    }
}


class triangle extends Check{
        Check s = new Check();
        double height;
        double area(){
        return s.lenght()*height;
        }
        }
public class Main{
    public static void main(String[] args){
        triangle n = new triangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the heigth :");
//        n.lenght()=s.nextDouble();
        n.height = s.nextDouble();
        System.out.println("The area is : "+n.area());

    }
}         