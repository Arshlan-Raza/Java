interface Polygon{
    void getArea();
    default void getSide(){
        System.out.println("I can get sides of Polygon");
    }
}

class Rectangle implements Polygon{

    int len;
    int bre;

    Rectangle(int l,int b){
        this.len = l;
        this.bre = b ;
    }

    public void getArea() {
        System.out.println("The Area of Square is : "+len*bre);
    }
    public void getSide(){
        System.out.println("It had four Sides");
    }
}

class Square implements Polygon{

    int side ;
    int bre;

    Square(int l ){

        this.side = l;

    }
    public void getArea(){
        System.out.println("The Area of Square is "+4*side);
    }
}

public class Area2 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(12,10);
        Square s = new Square(3);

        r.getArea();
        r.getSide();
        s.getArea();
        s.getSide();

    }
}