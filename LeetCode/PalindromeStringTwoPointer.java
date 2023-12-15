public class PalindromeStringTwoPointer {
    public static void main(String[] args) {
        String[]str={"abc","car","adaa","racecar","cool"};
        String str2="";
        boolean bool=true;
        int start=0;
        if(str.length!=0){
        for(int i=0;i<str[start].length();i++){
            if(palindrome(str[start], 0, str[start].length()-1, bool)){
                str2=str[start];
                break;
            }
            start++;
        }
        if(palindrome(str[str.length-1], 0, str[str.length-1].length()-1, bool)){
                str2=str[str.length-1];
            }
        }
        // while(start<str2.length()){
        //     if(palindrome(str[start], 0, str[start].length()-1, bool)){
        //         str2=str[start];
        //         break;
        //     }
        //     start++;
        // }
        
        System.out.println(str2);
    }
    static boolean palindrome(String str,int start,int end,boolean bool){
        while(start<=end){
            if(start==end){
                break;
            }
            if(str.charAt(start)!=str.charAt(end)){
                bool=false;
            }
            start++;
            end--;
        }
        return bool;
    }
}
