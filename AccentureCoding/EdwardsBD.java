package AccentureCoding;

public class EdwardsBD {
    public static void main(String[] args) {
        int piece=0;
        System.out.println(maxNumPieces(piece));
    }
    static int maxNumPieces(int piece){
        int cuts=0;
        cuts=piece*(piece+1)/2+1;
        return cuts%100000007;
    }
}
