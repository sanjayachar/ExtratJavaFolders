package AccentureCoding;

public class InversionCount {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(inversionCount(arr, arr.length));
    }
    static int inversionCount(int[]arr,int n){
        int count=0;
        if(n==0){
            return -1;
        }
        if(n<2){
            return 0;
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(i<j&&arr[i]>arr[j]){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
