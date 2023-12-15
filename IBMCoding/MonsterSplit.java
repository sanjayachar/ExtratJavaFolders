package IBMCoding;

import java.util.Arrays;

public class MonsterSplit {
    public static void main(String[] args) {
        String str="ppppppp@pppp@pp@ppp$pp$";
        String[]strAt=str.split("[@$]");
        System.out.println(Arrays.toString(strAt));
    }
}
