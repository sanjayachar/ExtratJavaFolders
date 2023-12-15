package IBMCoding;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcfOfNumbers(70, 15));
    }
    static int hcfOfNumbers(int num1,int num2){
        int hcf=0;
        for(int i=1;i<num1&&i<num2;i++){
            if(num1%i==0&&num2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
