package z1;

import java.util.Scanner;

public class Main {
    public static String mb(int kb){
        int a = kb/1024;
        int b = kb%1024;
        String c = "";
        c+="Мегабайт = "+a+"; килобайт = "+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во килобайт");
        int kb = in.nextInt();
        System.out.println("Ответ: "+mb(kb));

    }
}
