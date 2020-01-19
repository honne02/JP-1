import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x и y");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double R = 64;
        if ((R>=x*x+y*y&&x>=-2)||(R>=x*x+y*y&&x>=-2&&y>-1.5*x-2)) System.out.println("Входит");
        else System.out.println("Не входит");
    }
}
