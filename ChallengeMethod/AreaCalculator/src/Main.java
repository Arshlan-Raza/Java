import java.util.Scanner;

class Area{
    int length,height;
        int rectArea(){
             int area=length*height;
             return area;
    }
        double triArea(){
            double area2 = (double)(0.5*length*height);
            return area2;
        }
        double circArea(){
            double area3 = (double) (3.14*(length/2)*(length/2));
            return area3;
        }
        public static void main(String[] args){
            Area a = new Area();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the length :");
            a.length = s.nextInt();
            System.out.println("Enter the height :");
            a.height = s.nextInt();
            System.out.println("Area of Rectangle is = "+a.rectArea()+ (String.format("\nArea of circle is = " +"%.2f",
                    a.circArea())+ "\nArea of Triangle is = "+a.triArea()));
        }
}