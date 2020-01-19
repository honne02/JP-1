public class z1 {

    public static void main(String[] args) {
        int a = (int)(Math.random()*201+1);
        if (a%10 == 6) System.out.printf("Число %d оканчивается на 6",a);
        else System.out.printf("Число %d не оканчивается на 6",a);
    }
}
