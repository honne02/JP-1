import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),s = 0,j=0;
        for(int i = 1;i<=n;i++){
            int k = in.nextInt();
            if (k%6==0&&k%10==4){
                s+=k;
                j++;
            }
        }
        System.out.println("Среднее число = "+(double)s/j);
    }
}
