interface Series{
        int getNext();
        void reset();
        void setStart(int x);
}

class Bytwos implements Series{

        int start ;
        int val;
        Bytwos(){
                start = 0;
                val = 0;
        }
        public int getNext(){
                val+=2;
                return val;
        }
        public void reset(){
                val = 0;
        }
        public void setStart(int x){
                start = x;
                val = x;
        }
}

public class Main {
        public static void main(String[] args){
                Bytwos obj = new Bytwos();

                for(int i = 0; i < 5; i++){
                        System.out.println("Next Value is : "+obj.getNext());
                }

                System.out.println("Restarting...");
                obj.reset();
                for(int i = 0; i < 5; i++){
                        System.out.println("Next Value : "+obj.getNext());
                }

                obj.setStart(100);
                System.out.println("Starting at 100");
                for(int i = 0; i < 5; i++){
                        System.out.println("Next Value : "+obj.getNext());
                }
        }
}