import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double c = in.nextDouble();
        double b = c/1000;
        for(int i=100;i<=1000;i+=100){
            System.out.println("За "+i+" = "+i*b+" руб.");
        }

    }
}
