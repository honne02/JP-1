package z1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию Капитана:");
        String k = in.nextLine();
        System.out.printf("Напишите кол-во месяцев %s пробыл(а) в круглосветном путешествии: ",k);
        int m = in.nextInt();
        int years = m/12;
        System.out.printf("Капитан %s пробыл в кругосветном путешествии %d лет и %d месяцев",k,years,m%12);
    }
}
