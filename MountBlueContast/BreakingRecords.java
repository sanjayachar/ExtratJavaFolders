package MountBlueContast;

public class BreakingRecords {
    public static void main(String[] args) {
        int[]sc={3,4,21,36,10,28,35,5,24,42};
        int count1=0,count2=0;
        int i1=0,j1=1,i2=0,j2=1;
        while(j1<sc.length&&i1<sc.length){
            if(sc[i1]>sc[j1]){
                j1++;
                continue;
            } 
            if(sc[i1]!=sc[j1])
                count1++;    
            i1=j1;
            j1++;
        }
        while(j2<sc.length&&i2<sc.length){
            if(sc[i2]<sc[j2]){
                j2++;
                continue;
            } 
            if(sc[i2]!=sc[j2])
                count2++;    
            i2=j2;
            j2++;
        }
        System.out.println(count1+"\n"+count2);
    }
}
