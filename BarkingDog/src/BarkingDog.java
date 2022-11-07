public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking , int hourOfday){
        if(barking && hourOfday>=0 && hourOfday<8 || hourOfday>22 && barking && hourOfday<=23){
            return true;
        }
        else{
            return false;
        }
    }
}
