package academy.learnprogramming;

public class Main {
    public static void main(String[] args){

    float myMinFloatValue=Float.MIN_VALUE;;
    float myMaxFloatvalue=Float.MAX_VALUE;
        System.out.println("Float min value="+myMinFloatValue);
        System.out.println("Float max value="+myMaxFloatvalue);


        //Double

        double myMinDoubleValue=Double.MIN_VALUE;;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double min value="+myMinDoubleValue);
        System.out.println("Double max value="+myMaxDoubleValue);


        int myIntValue=5/3;
        float myFloatValue=5f/3f;// default value of decimal is double so better practice is to put f at declarations
        double myDoubleValue=5d/3d;

        System.out.println("My in t value="+myIntValue);
        System.out.println("MyFloatValue="+myFloatValue);//7 digits after decimal
        System.out.println("My double Value="+myDoubleValue);//16 digits
        // double is more precise than the float

        //Challenge pound to kilogram conversion
        //one pound =0.45359237kg

        double noOfPound=200d;
        double convertedKilogram=noOfPound*0.45359237d;
        System.out.println("converted kilogram="+convertedKilogram);



    }
}
