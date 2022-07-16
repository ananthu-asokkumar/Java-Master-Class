package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey");
        int myMinValue=Integer.MIN_VALUE;
        int myMaxValue=Integer.MAX_VALUE;
        System.out.println("Integer minimum value=" + myMinValue);
        System.out.println("Integer maximum value=" + myMaxValue);
        System.out.println("Busted max value =" + (myMaxValue+1));// Overflow
        System.out.println("Busted min value =" + (myMinValue-1));// Underflow

        //byte Datatype
        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;

        System.out.println("Byte Min value="+myMinByteValue);
        System.out.println("Byte Max value="+myMaxByteValue);

        //short Datatype
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;

        System.out.println("Short Min value="+myMinShortValue);
        System.out.println("Short Max value="+myMaxShortValue);


        //long DataType

        long myLongValue=100L;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;

        System.out.println("Long Min value="+myMinLongValue);
        System.out.println("Long Max value="+myMaxLongValue);

        //Casting

        byte myNewByte=(byte) (myMinByteValue/2);
        short myNewShort=(short) (myMinShortValue/2);
    }
}
