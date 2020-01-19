package z4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите скорость байкера");
        double v = in.nextDouble();
        int t = (int)(Math.random()*5+1);
        double s = 109-(v*t)%109;
        System.out.printf("через %d часов остановка на %.0f километраже",t,s);
    }
}
