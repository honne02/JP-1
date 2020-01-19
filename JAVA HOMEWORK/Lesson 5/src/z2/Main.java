package z2;

public class Main {
    public static int sum(int a){
        int ed = a/1000;
        int des = a%1000/100;
        int sot = a%100/10;
        int t = a%10;
        int b = ed+des+sot+t;
        return b;
    }
    public static void main(String[] args) {
        int a = (int)(Math.random()*10000+1000);
        System.out.printf("Сумма цифр числа %d = %d",a,sum(a));
    }
}
