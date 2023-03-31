package CIE;

import java.util.Scanner;

public class Internals extends Student{
    public int[] CIEMarks = new int[6];
    public void readCieMarks(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the CIE marks of all 6 subjects : ");
        for(int i = 0; i < 6 ; i++){
            CIEMarks[i] = ob.nextInt();
        }
    }
}
