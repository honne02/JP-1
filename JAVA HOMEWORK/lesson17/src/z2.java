import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max=0,a=1;
        while (a!=0){
            a = in.nextInt();
            if (a>max&&a%10==8){
                max=a;
            }
        }
        if (max==0){
            System.out.println("NO");
        }else{
            System.out.println("=> "+max);
        }
    }
}
