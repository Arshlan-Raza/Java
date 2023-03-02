package CIE;

import java.util.Scanner;

public class Internals extends Student{
    public int ciemarks[] = new int[6];
    public void readCieMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CIE marks of 6 subjects");
        for(int i=0;i<6;i++)
            ciemarks[i] = sc.nextInt();
    }
}

