import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x и y");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((x<=0 && y<=2-x*x && y>=0)||(x>=0 && y<=2-x*x && y>x)) System.out.println("Входит");
        else System.out.println("Не принадлежит");
    }
    }
