class GFG1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }
}
public class Implementing {
    public static void main(String[] args){
        GFG1 obj = new GFG1();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}