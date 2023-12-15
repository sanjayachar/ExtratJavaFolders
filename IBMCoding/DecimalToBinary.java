package IBMCoding;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal=46,copy=decimal;
        String result="";
        while(copy>0){
            int rem=copy%2;
            result+=rem;
            copy/=2;
        }
        System.out.println(result);
        String result2="";
        for(int i=result.length()-1;i>=0;i--){
            result2+=result.charAt(i);
        }
        System.out.println(result2);
    }
}
