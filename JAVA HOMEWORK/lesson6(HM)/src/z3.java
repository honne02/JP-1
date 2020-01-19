public class z3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100+10);
        if ((a/10+a%10)%7 == 0) System.out.printf("Сумма цифр числа %d кратна 7",a);
        else System.out.printf("Сумма цифр числа %d не кратна 7",a);
    }
}
