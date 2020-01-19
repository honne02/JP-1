package L10;

import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название фигуры (круг, треугольник, прямоугольник, ромб)");
        String a = in.next();
        double s = 0;
        switch (a){
            case "круг":
                System.out.println("Введите радиус.");
                double r = in.nextDouble();
                s = Math.PI*(r*r);
                System.out.println("S = "+s);
                break;
            case "треугольник":
                System.out.println("Введите высоту и сторону основания, на которую опущена эта высота.");
                double h = in.nextDouble();
                double o = in.nextDouble();
                s = 0.5*o*h;
                System.out.println("S = "+s);
                break;
            case "прямоугольник":
                System.out.println("Введите 2 стороны");
                double x = in.nextDouble();
                double z = in.nextDouble();
                s = x*z;
                System.out.println("S = "+s);
                break;
            case "ромб":
                System.out.println("Введите длины диагоналей");
                double d1 = in.nextDouble();
                double d2 = in.nextDouble();
                s = 0.5*d1*d2;
                System.out.println("S = "+s);
                break;
            }
    }
}
