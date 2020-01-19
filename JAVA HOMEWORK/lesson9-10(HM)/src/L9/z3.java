package L9;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x, y");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x==0||y==0) {
            System.out.println("Находится на оси координат");
        } else {
            if (x>0){
                if (y>0) System.out.println("1 координатная четверть");
                else System.out.println("4 координатная четверть");
            }else {
                if (y>0) System.out.println("2 координатная четверть");
                else System.out.println("3 координатная четверть");
            }
        }
    }
}
