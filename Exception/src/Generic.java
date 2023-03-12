class Bound<T extends A>{

    T obj ;
    Bound(T o){
        this.obj = o;
    }
    public void doRunTest(){
        this.obj.display();
    }


}
class A{
    public void display(){
        System.out.println("This is class A");
    }
}
class B extends A{
    public void display(){
        System.out.println("This is Subclass B");
    }
}
class C extends B{
    public void display(){
        System.out.println("This is Subclass C");
    }
}
public class Generic {
    public static void main(String[] args){

        Bound<A> aobj = new Bound<>(new A());
        aobj.doRunTest();

        Bound<B> bobj = new Bound<>(new B());
        bobj.doRunTest();

        Bound<C> cobj = new Bound<>(new C());
        cobj.doRunTest();

    }
}