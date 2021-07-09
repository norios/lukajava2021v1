import java.util.Scanner;

public class k1103 {
    public static double f(double x){
        //return x*x*x-2*x+1;
        return Math.sin(x);
    }
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);
        double x = stdIn.nextDouble();
        while  (x <= 3){
            double y = f(x);
            System.out.println(x+ "," + y);
            x = x + 0.1;
        }
        
    }
}