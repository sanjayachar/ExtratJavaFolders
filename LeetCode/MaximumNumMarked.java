public class MaximumNumMarked {
    public static void main(String[] args) {
        int[]arr={3,5,2,4};
        int count=0;
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if(2*arr[j]<=arr[i]){
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
