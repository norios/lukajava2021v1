import java.util.Scanner;
public class k0905 {
       
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);   
        double arr[] = new double[10];
        for( int i = 0; i<arr.length; i++){
            arr[i]=stdIn.nextDouble();
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}