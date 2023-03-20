class GFG extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Started Running....");
    }
}

public class Main {
    public static void main(String[] args){
        GFG g1 = new GFG();
        g1.start();
    }
}