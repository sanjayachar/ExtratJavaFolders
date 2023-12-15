package AccentureCoding;

public class DiffOfSum {
    public static void main(String[] args) {
        System.out.println(diffOfSum(3, 10));
    }
    static int diffOfSum(int m,int n){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
        }
        int sum3=sum1-sum2;
        return Math.abs(sum3);
    }
}
