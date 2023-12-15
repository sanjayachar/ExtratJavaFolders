package AccentureCoding;

public class OperationChoice {
    public static void main(String[] args) {
        System.out.println(operationChoice(10, 20, 3));
    }
    static int operationChoice(int a,int b,int c){
        int result=0;

        if(c==1)
            result=a+b;
        else if(c==2)
            result=a-b;
        else if(c==3)
            result=a*b;
        else if(c==4)
            result=a/b;

        return result;
    }
}
