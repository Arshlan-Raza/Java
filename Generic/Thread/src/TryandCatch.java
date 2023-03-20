class Mythread extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is Running ");
        }
        catch (Exception e){
            System.out.println("Exceptionn is caught");
        }
    }
}

public class TryandCatch {
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <= n ; i++){
            Mythread obj = new Mythread();
                obj.start();
        }
    }
}