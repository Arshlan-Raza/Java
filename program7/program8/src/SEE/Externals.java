package SEE;

import CIE.*;
import java.util.Scanner;

public class Externals extends Internals {

    public int[] SEE_Marks = new int[6];

    public void readSeeMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CIE marks of 6 subjects");
        for(int i=0;i<6;i++)
            SEE_Marks[i] = sc.nextInt();
    }
}
