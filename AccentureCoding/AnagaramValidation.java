package AccentureCoding;

import java.util.Arrays;

public class AnagaramValidation {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        System.out.println(validate(str1, str2)?"Yes":"No");

    }
    static boolean validate(String str1,String str2){
        boolean bool=false;
        if(str1.length()!=str2.length()){
            return bool;
        }
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str3="",str4="";
        for(int i=0;i<ch1.length;i++){
            str3+=Character.toLowerCase(ch1[i]);
            str4+=Character.toLowerCase(ch2[i]);
        }      
        return str3.equals(str4);
    }
}
