import java.util.Arrays;

public class ShortestDistance {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }
    static int[] shortestToChar(String s,char c){
        int[]arr=new int[s.length()];
        int n=s.length();
        int pos=-n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                pos=i;
            }
            arr[i]=i-pos;
        }
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                pos=i;
            }
            arr[i]=Math.min(arr[i],Math.abs(i-pos));
        }
        return arr;
    }
}
/* */
