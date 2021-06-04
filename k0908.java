import java.util.Scanner;
public class k0908 {
       
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);   
        double arr[] = new double[10];
        for( int i = 0; i<arr.length; i++){
            arr[i]=stdIn.nextDouble();
        }
        double dbl =0;
        for (int i = 0; i< arr.length; i++){
            dbl = dbl+arr[i];
        }

        double vec[] = new double[10];
        for (int i = 0; i< vec.length; i++){
            vec[i] = arr[i]/dbl;
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " -> " + vec[i]);
        }
        stdIn.close();

    }
}