public class challenge {
    public static void main(String[] args) {

    }

    public static long calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            long centimeter1 = (long) (inches * 2.54 + feet * 30.48);
            return centimeter1;
        } else {
            return -1;
        }
    }

    public static long calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            long calculated = calcFeetAndInchesToCentimeters(32, 43);
            long calculated2 = (long) (calculated * 0.3937);
            return calculated2;

        } else {
            return -1;
        }

    }
}
