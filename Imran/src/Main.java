import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
      for(int i=1;i<=n;++i){
          if(i==n) {
              for (int j = 1; j <= 10; j++) {
                  System.out.println(i + " * " + j + " = " + i * j);
              }
          }
          else{
              break;
              }
      }
    }
}
