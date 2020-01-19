import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x и y");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y<(x*x)-1)&&(y<-1*(x*x)+1)) System.out.println("Входит");
        else System.out.println("Не принадлежит");
    }
}
