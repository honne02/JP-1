package l15;

public class z3 {
    public static void main(String[] args) {
        int n = 3;
        int s = 0;
        for (int i = 1;i<=8;i++){
            n+=2;
            s+=n;
        }
        System.out.printf("на 9 день %d плиток => %d упоковок",n,(int)(Math.ceil((double)n/5)));
    }
}
