package l14;

public class z2 {
    public static void main(String[] args) {
        int s = 0;
        int n = 60;
        for (int i = 0;i<=12;i++){
            s+=n;
            n= (int) (n-((double)n/100)*2);
        }
        System.out.println("За год произойдет "+s+" аварий.");
    }
}
