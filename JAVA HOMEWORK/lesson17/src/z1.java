import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1,min=100000000,s=0,k=0;
        int i = 1;
        int b = 1;
        while (n!=0){
            b=n%10;
            n = n/10;
            if(b<min){min=b;}
            if(b%2==0){s+=b;k++;}
        }
        System.out.println("Минимальное число - "+min+";\nкол-во чёт. = "+k+";\nих сумма = "+s);

    }
}
