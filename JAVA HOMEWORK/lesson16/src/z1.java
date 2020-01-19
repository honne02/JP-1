public class z1 {

    public static void main(String[] args) {
        double maxT = -11;
        int maxN=8,k=0;
        for (int i = 1;i<=7;i++){
            double t = Math.random()*15-10;
            System.out.printf("%d день %.2f\n",i,t);
            if(t>maxT){
                maxT = t;
                maxN = i;
            }
            if(t>=0){
                k++;
            }
        }
        System.out.printf("Максимальная температура - %.02f № %d; кол-во дней(t>=0) = %d",maxT,maxN,k);

    }
}
