import java.util.Scanner;
public class k0906 {
       
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

        System.out.println(dbl/10);
        stdIn.close();
    }
}