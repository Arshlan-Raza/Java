import java.sql.SQLOutput;

class  X{

    int a;

    X(){}

    X(int i){
        a = i;
    }
}

class Y extends X{

    int a;

    Y(int i ){
        a = i;
    }
}

public class Main {
    public static void main(String[] args){

        X x = new X(10);

        X x2,x3;

        Y y = new Y(5);

        x2 = x;

        x3 = y;

        System.out.println("The value of x is : "+x2.a+"\nThe value of Y is :"+y.a);
    }
}