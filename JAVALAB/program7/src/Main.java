import java.util.Scanner;

class Circle{
    double radius;
    String color;

    Circle(){
        radius = 1.0;
        color = "Blue";
    }
    Circle(double radius){

        this.radius = radius;
        color = "Blue";
    }

    Circle(double radius, String color){

        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    double getArea(){
        return (Math.PI*radius*radius);
    }
}

class Cylinder extends  Circle{

    double height ;

    Cylinder(){
        super();
        height = 2.0;
    }
    Cylinder(double height){
        super();
        this.height = height;
    }
    Cylinder(double height,double radius){
        super(radius);
        this.height = height;
    }
    Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    double getArea(){
        return ((2*Math.PI*radius*height) + (2*Math.PI*radius*height));
    }
    double getVolume(){
        return (super.getArea() * height);
    }

    void display(){
        System.out.println("\nRadius is : "+super.radius+"\nHeight is : "+height+"\nColour is : "+super.color+"\nArea is : "
        +getArea()+"Volume is : "+getVolume());
    }

    void check(Cylinder c1 , Cylinder c2, int i, int j){
        if((c1.radius == c2.radius) && (c1.height == c2.height) && (c1.color.equalsIgnoreCase(c2.color))){
            System.out.println("Cylinder "+(i+1)+" Cylinder "+(j+1)+" are similar");
        }
    }
}

public class Main {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        Cylinder[] c = new Cylinder[4];
        c[0] = new Cylinder();
        c[1] = new Cylinder(3.0);
        c[2] = new Cylinder(2.0,1.0,"Green");
        System.out.print("Enter the value of height,radius,color for 4th cylinder : ");
        double ht = obj.nextDouble();
        double r = obj.nextDouble();
        obj.nextLine();
        String clr = obj.nextLine();

        c[3] = new Cylinder(ht,r,clr);

        for(int i = 0;i<4 ; i++){
            System.out.print("The dimensions of Cylinder "+(i+1)+" is ");
            c[i].display();
            System.out.println();
        }

        for (int i = 0; i < 4 ; i++){
            for(int j = i+1; j<4; j++){
                c[i].check(c[i],c[j],i,j);
            }
        }
    }
}