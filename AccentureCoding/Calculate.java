package AccentureCoding;

public class Calculate {
    public static void main(String[] args) {
        System.out.println(calculate(100, 160));
    }
    static int calculate(int m,int n){
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%3==0&&i%5==0){
                sum=sum+i;
            }
        }


        return sum;
    }
}
