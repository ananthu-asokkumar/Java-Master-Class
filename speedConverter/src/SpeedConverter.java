public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(1.609);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour<0){
            return -1;
        }
        long MilesPerHr=Math.round(kilometersPerHour/1.609);
        return MilesPerHr;
    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
            long MilesPerHr=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+"km/h="+MilesPerHr+"mi/h");

        }
    }

}
