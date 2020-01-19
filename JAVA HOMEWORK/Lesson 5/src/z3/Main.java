package z3;

import java.util.Scanner;

public class Main {
    public static int sleeptime(int timeUp, int timeSleep){
        int a=0;
        if (timeSleep>=timeUp){a = 1440-timeSleep+timeUp;}
        else {a = timeUp-timeSleep;}
        return a;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int timeUp = 6*60+30;
        System.out.println("Введите часы");
        int hour = in.nextInt();
        System.out.println("Введите минуты");
        int min = in.nextInt();
        if (hour > 24|| min > 59){
            System.out.println("Вы ввели не корректные данные. Пример '21 50'");}
        else {int timeSleep = hour*60+min;
        System.out.printf("Осталось поспать %d часов и %d минут",sleeptime(timeUp,timeSleep)/60,sleeptime(timeUp,timeSleep)%60);
    }
    }
}
