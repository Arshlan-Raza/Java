public class Main {
    public static void main(String[] args) {
        byte myByteValue=122;
        short myShortValue=3455;
        int myIntValue=34555;
        long totalOfAll=50000L+10L*(myByteValue+myIntValue+myShortValue);
        System.out.println(totalOfAll);

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float MaxValue= "+myFloatMaxValue+"\nFloat MinValue= " +myFloatMinValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        Double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double MaxValue= "+myDoubleMaxValue+"\nDouble MinValue= " +myDoubleMinValue);

        int myInttValue=4;
        float myFloattValue=(float)33.33;
        double myDoubleeValue = 43d;
        System.out.println(myInttValue+ "\n"+myDoubleeValue+ "\n" +myFloattValue);


    }
}