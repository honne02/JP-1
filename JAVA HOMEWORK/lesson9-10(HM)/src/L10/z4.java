package L10;

import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, знак, второе число");
        double a = in.nextInt();
        String x = in.next();
        double b = in.nextInt();
        switch (x){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
            case ":":
                if (b!=0){
                System.out.println(a/b);}
                else {System.out.println("Делить на ноль нельзя");}
                break;
        }
    }
}
