package z3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите город в который летит пасажир самолёта");
        String city = in.nextLine();
        System.out.println("Введите за сколько минут за которые пассажир прибудет в город "+city);
        int t = in.nextInt();
        int hour = t/60;
        System.out.printf("Пассажир долетит до города %s за %d часов и %d минут",city,hour,t%60);
    }
}
