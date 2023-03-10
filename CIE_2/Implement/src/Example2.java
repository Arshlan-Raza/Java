interface First{

    void MyMethod1();
}

interface Second{
    void MyMethod2();
}

class Some implements First,Second{

    public void MyMethod1(){
        System.out.println("Some Text...");
    }
    public void MyMethod2(){
        System.out.println("Some other Text...");
    }
}

public class Example2 {
    public static void main(String[] args){

        Some obj = new Some();
        obj.MyMethod1();
        obj.MyMethod2();
    }
}