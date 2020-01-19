import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x и y");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y>=-1*x-1)&&(y>x-1)&&(y<=x+1)&&(y<=1-x)) System.out.println("Входит");
        else System.out.println("Не входит");
    }
}
