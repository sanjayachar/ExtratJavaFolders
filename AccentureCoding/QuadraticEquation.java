package AccentureCoding;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a=1,b=-2,c=3;
        double sqrt=b*b-4*a*c;
        
        double pquad=(-b+Math.sqrt(sqrt))/(2*a);
        double nquad=(-b-Math.sqrt(sqrt))/2*a;

        System.out.println(pquad);
        System.out.println(nquad);
    }
}
