package CIE;

import java.util.Scanner;

public class Student {

    public String Name;
    public String USN;
    public int sem ;
    public void readStudent(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the student detail: ");
        Name = n.nextLine();
        USN = n.nextLine();
        sem = n.nextInt();
    }
}
