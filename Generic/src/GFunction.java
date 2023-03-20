
 class F{

    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+" = "+element);
    }

}
public class GFunction {
    public static void main(String[] args){
        F obj = new F();
        obj.<Integer>genericDisplay(10);
//        genericDisplay("Arshlan");
//        genericDisplay(1.11);
    }
}

