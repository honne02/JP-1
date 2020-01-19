package L10;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во очков");
        int a = in.nextInt();
        switch (a){
            case 0:
                System.out.println("Проигрыш.");
                break;
            case 1:
                System.out.println("Ничья.");
                break;
            case 2:
                System.out.println("Победа.");
                break;
            default:
                System.out.println("Такого не может быть");
                break;
        }
    }
}
