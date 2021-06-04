import java.util.Scanner;
public class k0907 {
       
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);   
        double arr[] = new double[10];
        for( int i = 0; i<arr.length; i++){
            arr[i]=stdIn.nextDouble();
        }
        double max_val =arr[0];
        double min_val =arr[0];
        for (int i = 0; i< arr.length; i++){
            if (max_val < arr[i]) max_val = arr[i];
            if (min_val > arr[i]) min_val = arr[i];
        }

        System.out.println("最大値:" + max_val);
        System.out.println("最小値:" + min_val);
        stdIn.close();
    }
}