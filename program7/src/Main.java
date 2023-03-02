import java.util.Scanner;

class Circle{

    double radius ;
    String Color ;
    Circle(){
        radius = 1.0;
        Color = "Blue";
    }
    Circle(double radius){
        this.radius = radius;
        Color = "Blue";
    }
    Circle(double radius ,String color){
        this.radius = radius;
        this.Color = color;
    }
    double getArea(){
        double area = Math.PI*radius*radius;
        return  area;
    }
    double getRadius(){
        return radius;
    }
    String getColor(){
        return Color;
    }
}

class Cylinder extends Circle{

    double height ;
    Cylinder(){
        super();
        height = 2.0;
    }
    Cylinder(double height){
        super();
        this.height = height;
    }
    Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    Cylinder(double height,double radius,String color ){
        super(radius,color);
        this.height = height;
    }
    double getArea(){
        double ans = (2*Math.PI*radius*radius)+(2*Math.PI*radius*radius);
        return ans ;
    }
    double getvolume(){
        double vol = getArea()*height;
        return vol;
    }
    void display(){
        System.out.println("\nRadius is : "+super.radius+"\nColor is : "
                +super.Color+"\nHeight is : "+height+"\nArea is : "+getArea()+"\nVolume is : "+getvolume());
    }
    void check(Cylinder c1,Cylinder c2 ,int i , int j ){
        if(c1.radius == c2.radius && c1.Color == c2.Color && c1.height == c2.height )
            System.out.println("The cylinder "+(i+1)+" and The cylinder "+(j+1)+" are similar");
    }
}

public class Main{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        Cylinder[] c = new Cylinder[4];

        c[0] = new Cylinder();
        c[1] = new Cylinder(3.0);
        c[2] = new Cylinder(3.0, 4.0);

        System.out.println("Enter the details of 4th cylinder i.e,\nHeight,Radius,Color");

        double h = s.nextDouble();
        double r = s.nextDouble();
        s.nextLine();
        String se = s.nextLine();
        c[3]  = new Cylinder(h,r,se);

        for(int i = 0; i < 4 ; i++){
            System.out.println("\nThe dimensions of Cylinder "+(i+1)+" is");
            c[i].display();
            for(int j = i+1; j < 4; j++){
                c[j].check(c[i],c[j],i,j);
            }
        }




    }
}