package MountBlueContast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReducedString {
    public static void main(String[] args) {
        System.out.println(superReducedString("baab"));
    }
    public static String superReducedString(String str) {
        char[]ch=str.toCharArray();
        Arrays.sort(ch);
        String s=new String(ch);
        System.out.println(s);
        String strCpy="";
        int i=0,j=1;
        List<String>aList=new ArrayList<>();
        while(i<s.length()&&j<s.length()){
            while(j<s.length()&&s.charAt(i)==s.charAt(j)){
                j++;
            }
            aList.add(s.substring(i,j));
            i=j;
            j++;
        }
        if(i<s.length()){
            aList.add(s.substring(i, j));
        }
        // String hold=aList.get(aList.size()-1);
        // hold+=s.substring(i,j);
        // aList.set(aList.size()-1, hold);
        for (String string : aList) {
            if(string.length()%2!=0){
                strCpy+=string.charAt(0);
            }
        }
        // strCpy=sample;
        return strCpy.isEmpty()?"Empty String":strCpy;
}
}
// while(j<s.length()&&i<s.length()){
//     String sample="";
//     if(s.charAt(i)==s.charAt(j)){
//         // sample+=s.charAt(i);
//         // System.out.println(s.charAt(i));
//         j++;
//         continue;
//     }
//     int k=i;
//     while (k<j) {
//         sample+=s.charAt(k);
//         k++;
//     }
//     System.out.println(s.substring(i, j));
//     // System.out.println(i+" "+j);
//     System.out.println(sample);
//     if(sample.length()%2!=0){
//         strCpy+=s.charAt(i);
//     }
//     i=j;
//     j++;
//     // System.out.println(j);
// }
