package IBMCoding;

public class OccurencesContinue {
    public static void main(String[] args) {
        String str="a3b5c2a2";
        String output="";
        int charCount=0;
        for(int i=0,j=1;i<str.length()&&j<str.length();i+=2,j+=2){
            charCount=Integer.parseInt(str.charAt(j)+"");
            System.out.println(charCount);
            while(charCount>0){
                output+=str.charAt(i);
                charCount--;
            }
        }
        System.out.println(output);
    }
}
