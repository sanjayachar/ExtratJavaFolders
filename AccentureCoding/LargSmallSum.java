package AccentureCoding;

public class LargSmallSum {
    public static void main(String[] args) {
        int[]arr={3,2,1,7,5,4};
        System.out.println(largeSmallSum(arr));
    }
    static int largeSmallSum(int []arr){
        int firstSmall=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        int firstLarg=0;
        int secondLarg=0;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>firstLarg){
                    secondLarg=firstLarg;
                    firstLarg=arr[i];
                }
                else if(arr[i]>secondLarg){
                    secondLarg=arr[i];
                }
            }
            if(i%2!=0){
                if(arr[i]<firstSmall){
                    secondSmall=firstSmall;
                    firstSmall=arr[i];
                }
                else if(arr[i]<secondSmall){
                    secondSmall=arr[i];
                }
            }
        }
        return secondLarg+secondSmall;
    }
}
