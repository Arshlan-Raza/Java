package SEE;
import CIE.*;

import java.util.Scanner;

public class Externals extends Internals{
    public int[] SEEMarks = new int[6];
    public void readSeeMarks(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the SEE marks of all 6 subjects : ");
        for(int i = 0; i < 6 ; i++){
            SEEMarks[i] = ob.nextInt();
        }
    }
}
