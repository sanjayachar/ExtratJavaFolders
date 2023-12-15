package AccentureCoding;

public class SumOfOddNum {
    public static void main(String[] args) {
        int[]arr={1,4,6,7,10,12,11,5};
        System.out.println(sumOddInt(arr, arr.length));
    }
    static int sumOddInt(int[]arr,int n){
        int sum=0;
        int i=0;
        while (i<n) {
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
            i++;
        }
        return sum;
    }
}
