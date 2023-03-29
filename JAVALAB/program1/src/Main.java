public class Main {
     static float series(float n){

        float i;
        float sum = 0;

        for(i = 1; i<=n; i++){
            sum += 1/(i*i);
        }
        return sum;
    }
    public static void main(String[] args){

         float n = 3;
         float res = series(n);
        System.out.println("The answer of series is : "+res);
    }
}