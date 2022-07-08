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

    }
}
