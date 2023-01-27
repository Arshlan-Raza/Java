 class Check {
    private double length;
    private double breadth;
    void show(){
        System.out.println("The length is = "+length+"\nThe breadth is = "+breadth);
    }
}
Class triangle extends check{
                double height;
                double area(){
                    return length*heigth;
         }
}
public class Main{
    public static void main(String[] args){
        triangle n = new triangle;
        System.out.println("The area is : "+n.area);

    }
}