package z3;

public class z3 {
    public static void main(String[] args) {
        int salary = 10200;
        int p = (int) (Math.random()*46+5);
        double d = (salary/100)*p+salary;
        double r = d - d /100*13;
        System.out.printf("процент премии = %d; в рублях = %.2f; вместе с подоходным налогом = %.2f",p,d,r);
    }
}
