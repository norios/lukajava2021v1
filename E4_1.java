import java.util.Scanner;
public class E4_1 {
    public static void main(String [] args){
        int[] x = new int[3];
        double[] y = new double[3];
        Scanner input = new Scanner(System.in);
        System.out.println("値を入力:");
        for (int i = 0; i<x.length; i++){
            x[i] = input.nextInt();
            y[i] = x[i];
        }
        // y = x;
        for(int i = 0; i < y.length; i++){
            System.out.println("[" + i + "] int: " + x[i]+ " double: " + y[i]);
        }
        input.close();
    }
}
