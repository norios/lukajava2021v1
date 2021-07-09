import java.util.Scanner;

public class k1101 {
    public static double f(double x){
        return x*x*x-2*x+1;
    }
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);
        double x = stdIn.nextDouble();
        double y = f(x);
        System.out.println(x+ "," + y);
        
    }
}