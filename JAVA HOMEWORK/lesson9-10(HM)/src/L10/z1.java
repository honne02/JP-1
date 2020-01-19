package L10;

import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int a = in.nextInt();
        if (a<13 && a>0){
            switch (a){
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
        }
        }
        else {
            System.out.println("Нет такого месяца");
        }
    }
}
