class ExcDemo1 {

    // Main driver method
    public static void main(String args[])
    {
        int [ ] nums=new int [4];

        try {

            System.out.println("Before exception is generated.");
            nums[7] = 10;   //attempt to index post nums boundary
            //Out of Bound exception
            System.out.println("this won’t be displayed");
        }
        catch ( ArrayIndexOutOfBoundsException exc)  {

//Catch the exception
        System.out.println("Index out-of-bounds");
    }
        System.out.println("After Catche....");

    }
}
