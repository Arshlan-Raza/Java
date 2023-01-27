public class mainn{

    public static void main(String[] args) {
        Main g = new Main();
        g.describeCar();
        System.out.println("**********************************");
        System.out.println("car is made by : " + g.getMake() +
                "\nThe model of the car is : " + g.getModel());
    }
}