package MountBlueContast;

public class KangaroosJump {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        int x1=0,v1=3,x2=4,v2=2;
        int i=0,j=0;
        int hold=0;
        while(i<=v1){
            i++;
        }
        sum1=Math.abs(x1-v1)*x2;
        hold=Math.abs(x1-v1)+1+(x2*v2);
        
        // System.out.println(i+"\n"+j);
        System.out.println(hold); 
        System.out.println(sum1+"\n"+sum2/2);
    }
}
