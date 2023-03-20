class Test<T>{

    T obj ;
    Test(T o){
        this.obj = o;
    }

    public T getObject(){
        return this.obj;
    }
}

public class Main {
    public static void main(String[] args){

        Test <Integer> obj = new Test<Integer>(10);
        System.out.println("The value is : "+obj.getObject());

        Test <String> obj1 = new Test<String>("Arshlan");
        System.out.println("The value is : "+obj1.getObject());
    }
}