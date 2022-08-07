package academy.learnprogramming;

public class Main {

    public static  void main(String[] args){
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString="This is String";
        System.out.println("mystring is equal to :"+myString);
        myString+=", and this is more";
        System.out.println("mystring is equal to :"+myString);
        myString+="\u00A9 2009";
        System.out.println("mystring is equal to :"+myString);

        String numberString="250.55";
        numberString+=49.45;
        System.out.println(numberString);

    }
}
