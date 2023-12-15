package ByteStream;

import java.util.TreeMap;
import java.util.TreeSet;

interface A{
    default void show(){
        System.out.println("Default A");
    }
}
interface B{
    default void showB(){
        System.out.println("Default B");
    }
}
public class Sample implements A,B{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(arr.toString());
        TreeSet<Integer>t=new TreeSet<>();
        TreeMap<Integer>tp=new TreeMap<>();
        A a=new A(){
            @Override
            public void show() {
                // TODO Auto-generated method stub
                A.super.show();
            }
        };
    }
}
