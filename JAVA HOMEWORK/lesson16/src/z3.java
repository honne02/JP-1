import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double rezult=10000000;
        int numrezuly = 0;
        for (int i =1;i<=5;i++){
            System.out.print("Введите время "+i+" участника: ");
            double rez = in.nextDouble();
            double st = Math.random()*5;
            System.out.printf("штрафное время = %.2f\n",st);
            if (rez+st<rezult){
                rezult=rez+st;
                numrezuly = i;
            }
        }
        System.out.printf("ЛУЧШИЙ РЕЗУЛЬТАТ - %.2f; под номером => %d",rezult,numrezuly);
    }
}
