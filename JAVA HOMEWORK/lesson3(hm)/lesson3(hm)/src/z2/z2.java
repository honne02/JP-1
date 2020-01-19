package z2;

public class z2 {
    public static void main(String[] args) {
        double cost = 42.07;
        int n = (int) (Math.random()*36+5);
        System.out.printf("Стоимость за 1 литр = %.2f; всего литров = %d; стоимость за них = %.2f",cost,n,cost*n);
    }
}
