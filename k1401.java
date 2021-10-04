public class k1401 {
    public static double df( double x){
        return 3*x*x-2;
    }
    public static double fa( double x){
        return x*x*x-2*x;
    }
    public static void main(String []args){
        double y = 0.0;
        final double dx = 0.1;

        for (double x=0; x<2; x+=dx){
            double dy = df(x);
            double ya = fa(x);
            System.out.println(x + "\t" + y + "\t" + ya);
            y += dy*dx;

        }

    }
}