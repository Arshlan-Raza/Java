
class Test1<T,U>{

    T obj ;
    U obj1;
    Test1(T ob, U obb){
        this.obj = ob;
        this.obj1 = obb;
    }

    public void print(){
        System.out.println("Input : "+this.obj);
        System.out.println("Input : "+this.obj1);
    }
}

public class TwoParameter {
    public static void main(String[] args){
        Test1<String,Integer> obj = new Test1<>("Arshlan",1);
        obj.print();
    }
}