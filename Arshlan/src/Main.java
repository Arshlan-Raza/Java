public class Main {
    public static void main (String[] args){
        double var1=20.00d;
        double var2=80.00d;
        double addition=var1+var2*100d;
//        addition*=100d;
        double remainder;
        remainder=addition%40.00d;
        boolean value;
        if(remainder==0){
            value=true;
        }
        else{
            value=false;
        }
        System.out.println(value);
        if(value==false){
            System.out.println("Got some remainder");
        }
    }

}