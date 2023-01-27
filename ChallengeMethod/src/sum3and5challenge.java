public class sum3and5challenge {
    public static void main(String[] args){
        int number[]={};
        int temp[]={};
        int sum=0;
        for(int i=1;i<=1000;++i){
            if(i%3==0 && i%5==0){
                temp[i] = number[i];
            }
            if(number[i]==4){
                break;
            }
        }
        for(int j=0;j<5;++j){
            sum+=temp[j];
        }
        System.out.println("The sum is : "+sum);

    }
}
