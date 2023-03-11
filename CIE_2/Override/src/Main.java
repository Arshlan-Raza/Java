class A{

    int d,e;
    A(int d,int e){
        this.d = d;
        this.e = e;

    }
    public void show(){
        System.out.println("The value of d :"+d+"\nThe value of e :"+e);
    }
}
class B extends A{

    int f;
    B(int d,int e,int f){
        super(d,e);
        this.f = f;
    }
    public void show(){
        System.out.println("The value of d :"+d+"\nThe value of e :"+e+"\nThe value of f :"+f);
    }
}

public class Main {
    public static void main(String[] args){
        B obj = new B(12,41,13);
        obj.show();
    }
}