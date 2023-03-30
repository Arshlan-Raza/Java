import java.lang.module.Configuration;

class Complex{
    int real;
    int imag;

    Complex(){}

    Complex(int tempreal, int tempimag){

        this.real = tempreal;
        this.imag = tempimag;
    }
    Complex addComp(Complex c1 , Complex c2){

        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
    Complex subComp(Complex c1 , Complex c2){

        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.imag = c1.imag - c2.imag;
        return  temp;
    }

    void display(){
        System.out.println(real+"+"+"("+imag+"i"+")");
    }

}

public  class Main {
    public static void main(String[] args){

        Complex c1 = new Complex(5,1);
        System.out.print("The complex number is : ");
        c1.display();
        Complex c2 = new Complex(3,2);
        System.out.print("The complex number is : ");
        c2.display();

        Complex c3 = new Complex();
        c3 = c3.addComp(c1,c2);
        System.out.print("Addition of two complex number is : ");
        c3.display();

        Complex c4 = new Complex();
        c4 = c4.subComp(c1,c2);
        System.out.print("Addition of two complex number is : ");
        c4.display();
    }
}