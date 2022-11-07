package data.structures;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//      [2,6,1,9,7,5,3]
//rotate k=10 times left to right
        // [9,7,5,3,2,6,1]
        // step 1: separate array into 2 arrays
        // firstArray=k%lenght of array
        // secondArray=k%lenght of array to n-1 th elem
        // join second + first array
        int[] arr={2,6,1,9,7,5,3};

        int k=21;
        arrayRotate(arr,k);


    }

    private static void arrayRotate(int[] arr,int k) {
        int n=arr.length;
        //int firstarray=k%n;
        //int sarr=k%n to n-1;
        int j=0;
        int[] result=new int[n];
        System.out.println("result"+result.length);

        for(int i=k%n;i<n;i++)
        {
            result[j++]=arr[i];
        }
//        for(j=0;j<n;j++)
//        {
//            System.out.println(result[j]);
//        }

        //
        //      [2,6,1,9,7,5,3]
        //arr 9753  753
		for(int i=0;i<k%n;i++)
		{
			result[j++]=arr[i];
		}
		for(j=0;j<n;j++)
		{
			System.out.print(result[j]);
		}


    }

}