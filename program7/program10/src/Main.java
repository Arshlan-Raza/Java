import java.util.Random;

class EvenNum implements Runnable{
    public int a;
    public EvenNum(int a){
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("The thread "+a+" is Even and Square is : "+a*a);
    }
}
class OddNum implements Runnable{
    public int a;
    public OddNum(int a){
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("The thread "+a+" is Odd and Cube is : "+a*a*a);
    }
}

class RandomNumGenerate extends Thread{

    public void run() {
       int n ;
        Random rand = new Random();
        try{
            for(int i = 0; i < 10; i++){
                    n = rand.nextInt(20);
                    System.out.println("Random Number Generated is : "+n);
                    if(n % 2 == 0){
                        Thread t1 = new Thread(new EvenNum(n));
                        t1.start();
                    }
                    else{
                        Thread t2 = new Thread(new OddNum(n));
                        t2.start();
                        Thread.sleep(1000);
                    }
                }
            }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Main{
    public static void main(String[] args){
        RandomNumGenerate r = new RandomNumGenerate();
        r.start();
    }
}

