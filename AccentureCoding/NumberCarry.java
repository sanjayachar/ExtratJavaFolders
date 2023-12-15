package AccentureCoding;

public class NumberCarry {
    public static void main(String[] args) {
        System.out.println(numberOfCarry(2397483, 56364));
    }
    /*2397483
     *  56364
     * 
     */
    static int numberOfCarry(int num1,int num2){
        int sum=0;
        int count=0;
        while (num1>0&&num2>0) {
            int rem1=num1%10;
            int rem2=num2%10;
            sum=rem1+rem2;
            if(sum+1>9){
                count++;
            }
            num1=num1/10;
            num2=num2/10;
        }

        return count;
    }
}
