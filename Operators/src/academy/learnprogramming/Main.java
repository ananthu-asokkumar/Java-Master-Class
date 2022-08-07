package academy.learnprogramming;

public class Main {
    public static void main(String[] args){
        int result =1+2;//3
        System.out.println("1+2="+result);
        int previousResult=result;
        System.out.println("previous result="+previousResult);
        result-=1;
        System.out.println("3-1="+result);
        System.out.println("previous result="+previousResult);

        double first=20.00d;
        double second=80.00d;
        double resultVariable=(first+second)*100d;
        double rem=resultVariable%40.00d;
        boolean res=rem==0?true:false;
        if(!res)
        System.out.println("Got some remainter");
    }
}
