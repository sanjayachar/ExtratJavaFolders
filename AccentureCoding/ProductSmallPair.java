package AccentureCoding;

public class ProductSmallPair {
    public static void main(String[] args) {
        int[]arr={9,8,-7,3,9,3};
        System.out.println(productSmallPair(4, arr));
    }
    static int productSmallPair(int sum,int[]arr){
        int sum2=0;
        int product=0;
        if(arr==null||arr.length<2){
            return -1;
        }
        int firstSmall=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstSmall){
                secondSmall=firstSmall;
                firstSmall=arr[i];
            }
            else if(arr[i]<secondSmall){
                secondSmall=arr[i];
            }
        }
        if(firstSmall+secondSmall>sum||firstSmall*secondSmall>sum){
            return 0;
        }
        sum2=firstSmall+secondSmall;
        product=firstSmall*secondSmall;
        return sum2<product?sum2:product;
    }
}
