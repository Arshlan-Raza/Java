package Exam;
import CIE.*;
import SEE.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of Student : ");
        n = ob.nextInt();
        Externals e[] = new Externals[n];
        int Total_Marks[] = new int[6];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the Details of Student "+i+1);
            e[i] = new Externals();
            e[i].readStudent();
            e[i].readCieMarks();
            e[i].readSeeMarks();
            for(int j = 0; j < 6; j++){
                Total_Marks[j] = e[i].ciemarks[j] + e[i].SEE_Marks[j];
                System.out.println("Total Marks of Student : "+e[i].name+ " is "+Total_Marks[j]+" ");
                System.out.println();
            }

        }
        System.out.println("Good Bye");
    }
}
