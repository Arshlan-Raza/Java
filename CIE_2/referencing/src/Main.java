 /*class Bike{

        int gear ;
        int speed ;
        Bike(int gear, int speed){

            this.gear = gear;
            this.speed = speed;
        }

        public void applyBreak(int decrease){

            speed -= decrease;
        }
        public void applyGear(int increment){

            speed += increment;
        }
        public String toString(){
            return("No of gear are : "+gear+"\nThe speed of the vehicle is: "+speed);
        }

}

class MountainBike extends Bike{

    int seatHeight;

    MountainBike(int startheight,int gear, int speed){
        super(gear,speed);
        this.seatHeight = startheight;
    }
    public void setHeight(int height){
        this.seatHeight = height;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nSeat Height is : "+seatHeight);
    }
}

public class Main {
    public static void main(String[] args){
        //superclass reference variable
        Bike b1 = new MountainBike(20,25,32);

        //subclass reference variable
        MountainBike m1 = new MountainBike(23,32,43);

        System.out.println("Seat of the Bike is : "+m1.seatHeight);
        System.out.println();

        System.out.println(b1.toString());
        System.out.println();
        System.out.println(m1.toString());

        MountainBike mb3 ;

        mb3 = (MountainBike)b1;

        mb3.setHeight(20);
        System.out.println();
        System.out.println();

        System.out.println("The new height is :"+mb3.seatHeight);


    }
}*/


  class Animal {
     public void makeSound() {
         System.out.println("Animal is making a sound.");
     }
 }

  class Cat extends Animal {
     @Override
     public void makeSound() {
         System.out.println("Meow");
     }
 }

  class Dog extends Animal {
     @Override
     public void makeSound() {
         System.out.println("Woof");
     }
 }

 public class Main {
      public static void main(String[] args){
          Animal s = new Animal();
          s.makeSound();
      }
}
