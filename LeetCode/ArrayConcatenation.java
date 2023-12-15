public class ArrayConcatenation {
    public static void main(String[] args) {

        int[]arr={7,52,2,4};
        int start=0;
        int end=arr.length-1;
        int concat=0;
        while(start<end){
            int c=Integer.parseInt(""+arr[start]+arr[end]);
            concat=concat+c;
            start++;
            end--;
        }
        if(arr.length%2!=0){
            concat=concat+arr[arr.length/2];
        }

        System.out.println(concat);
    }
}
