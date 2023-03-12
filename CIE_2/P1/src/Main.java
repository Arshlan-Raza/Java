

class X1{

    int a;
    X1(int i){
        a = i;
    }
}

class X2 extends X1{

    int a;
    X2(int i,int j){
        super(j);
        a = i;
    }
}
public class Main {

    public static void main(String[] args){

        X1 x = new X1(10);

        X1 x_1;

        x_1 = x;

        X2 y = new X2(15,5);

        System.out.println("The value of a is : "+x_1.a);

        x_1 = y;

        System.out.println("The value of a is : "+x_1.a);

//        x_1.a = 12;
        X2 x_2;

        x_2 = y;

        System.out.println("The value of a is : "+y.a);

    }
}
