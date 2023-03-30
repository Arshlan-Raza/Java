class Mytime{

    private int hour,minute;
    Mytime(int hr, int min){
        setTime(hr,min);
    }
    void setTime(int hr, int min ){
        if(hr>=0 && hr<=23 && min>=0 && min<=59){
            hour = hr;
            minute = min;
        }
        else{
            System.out.println("Invalid Time");
        }
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    void nextHour(){
        if(hour>23){
            hour = 0;
        }
    }

    void nextMinute(){

        minute++;

        if(minute>59){

            minute = 0;
            hour++;

            if(hour>23){
                hour = 0;
            }
        }
    }

}

public  class Main {
    public static void main(String[] args){
        Mytime obj = new Mytime(22,58);
        System.out.println("Hour: "+obj.getHour()+"\nMinute: "+obj.getMinute());

        obj.nextHour();
        obj.nextMinute();

        System.out.println("Updated Hour and Minute");
        System.out.println("Hour: "+obj.getHour()+"\nMinute: "+obj.getMinute());
        obj.nextMinute();
        System.out.println("Hour: "+obj.getHour()+"\nMinute: "+obj.getMinute());
    }
}