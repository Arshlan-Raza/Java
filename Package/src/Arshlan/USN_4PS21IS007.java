package Arshlan;

class USN_4PS21IS007 {
    String Name;
    String USN;
    char Section;
    String Department;

    void display(String n, String u , char s , String d){

        Name = n ;

        USN = u;

        Section = s ;

        Department = d;

        System.out.println("Name = " +n+ "\n" +  "USN = " +u+ "\n" +
                "Section = " +s+ "\n" + "Department = " +d+ "\n" );
    }
}
