package AccentureCoding;

public class ViceVersaChar {
    public static void main(String[] args) {
        System.out.println(replaceChar("apples", 'a', 'p'));
    }
    static String replaceChar(String str,char ch1,char ch2){
        String result="";
        char[]ch3=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch3[i]==ch1){
                ch3[i]=ch2;
            }else if(ch3[i]==ch2){
                ch3[i]=ch1;
            }
        }
        for(int i=0;i<ch3.length;i++){
            result+=ch3[i];
        }
        return result;
    }
}
