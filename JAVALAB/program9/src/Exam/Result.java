package Exam;
import CIE.*;
import SEE.*;

import java.util.Scanner;

public class Result {
    public static void main(String[] args){
        int n  ;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of student :");
        n = obj.nextInt();

        Externals[] e = new Externals[n];
        int totalMarks[] = new int[6];



        for(int j = 0 ; j<n ; j++){
            System.out.println("Enter the details of student "+(j+1)+" : ");
            e[j] = new Externals();
            e[j].readStudent();
            e[j].readCieMarks();
            e[j].readSeeMarks();
            for(int i = 0; i<6; i++){
                totalMarks[i] = e[j].CIEMarks[i]+e[j].SEEMarks[i];
            }
            System.out.print("Total Marks of"+e[j].Name+" in all 6 Subject is ");
            for(int i =0; i<6;i++){
                System.out.print("\t"+totalMarks[i]);
            }
        }
        System.out.println("\nGoodBye...");

    }
}
