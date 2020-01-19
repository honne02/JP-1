package z2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость одного литра бензина АИ-92 г.Вологда");
        double a = in.nextDouble();
        int l = (int)(1000/a);
        double ost = 1000%a;
        System.out.printf("За 1000 р можно купить %d литров АИ-92; сдача = %.2f",l,ost);
    }
}
