package MountBlueContast;

public class Staircase {
    public static void main(String[] args) {
        int n=6;
        for(int i=n;i>0;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
