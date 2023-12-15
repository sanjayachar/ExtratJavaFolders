package AccentureCoding;

import java.util.ArrayList;
import java.util.List;

public class MtrixOddNadEven {
    public static void main(String[] args) {
        int[][]matrix={ {2,12,32,15,3},
                        {89,2,12,34,5},
                        {6,31,1,34,5}};
        System.out.println(matrixSum(matrix));
    }
    static int matrixSum(int[][]matrix){
        int sum=0;
        List<Integer>al1=new ArrayList<>();
        List<Integer>al2=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i%2==0&&j%2==0){
                    al1.add(matrix[i][j]);
                }else if(i%2!=0&&j%2!=0){
                    al1.add(matrix[i][j]);
                }
            }
        }
        System.out.println(al1);
        System.out.println(al2);
        return sum;
    }

}
