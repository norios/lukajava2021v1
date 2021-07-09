public class k1106 {
    public static double f(double x){
        return x*x*x-2*x+1;
    }
    public static double dfdx(double x){
        double dx = 0.01;
        return f(x) / dx;
    }

    public static void main(String []args){
        for (double x = -3.14; x<3.14; x+=0.1){
           System.out.println(x+","+f(x)+","+dfdx(x));     
        }
      }
}

