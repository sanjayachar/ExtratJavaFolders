package AccentureCoding;

public class SuperiorArrayEle {
    public static void main(String[] args) {
        int[]arr={1,9,2,8,7};
        System.out.println(findNumberOfSuperiorElements(arr,arr.length-1));
    }
    static int findNumberOfSuperiorElements(int[]arr,int n){
        if(n<=0){
            return 0;
        }
        int count=1;
        int last=arr[n];
        int i=n-1;
        while(i>=0){
            if(arr[i]>last){
                last=arr[i];
                count++;
            }
            i--;
        }
        return count;
    }
}
