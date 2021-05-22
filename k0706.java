public class k0706 {
    public static void main(String[] args) throws Exception {
        double a =10;
        double r = 0.2;
        double sum = 0 ;

        for (int n = 0;n<=10;n++){
            sum = sum + a;
            System.out.println("a" + n + " = " + a);
            a *= r;

        }

        System.out.println("合計は" + sum);
    }
}