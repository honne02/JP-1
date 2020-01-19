package l14;

import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int s = 0;
        for (int i = 1;i<=6;i++) {
            System.out.println("Введите количество шайб, забытых командой №" + i);
            int n = in.nextInt();
            if(n>=0){
                if (n<5){k++;}
                s+=n;
            }else{
                System.out.println("такого не может быть, пробуй ещё раз");
                i--;
            }
        }
        System.out.printf("Кол-во команд (n<5) = %d\nСуммарное кол-во очков = %d)",k,s);
    }
}
