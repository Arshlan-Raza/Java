package CIE;

import java.util.Scanner;
public class Student {
    public String name, usn;
    int sem;
    public void readStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, usn and sem");
        name = sc.next();
        usn  = sc.next();sem = sc.nextInt();
    }
}
