package l14;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во целых чисел");
        int n = in.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите число №" + i);
            if (Math.abs(in.nextInt())%10==5){
                k++;
            }
        }
        System.out.printf("%d чисел",k);
    }
}

