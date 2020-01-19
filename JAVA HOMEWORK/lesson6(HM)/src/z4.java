import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во баллов (от 0 до 34) по русскому, математике и информатике через пробел");
        int a1 = in.nextInt();
        if (a1<35&&a1>=0) {
            int a2 = in.nextInt();
            if (a2<35&&a2>=0){
                int a3 = in.nextInt();
                if (a1 + a2 + a3 >= 50&&a3<35&&a3>=0) System.out.println("Поступит");
                else System.out.println("Не поступит");
            }
            else System.out.println("такого кол-ва баллов не может быть");
        }
        else System.out.println("такого кол-ва баллов не может быть");
    }
}
