import java.util.Scanner;
public class k0705 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);  
        int n =1;
        int i = 1;
        int nprev = 0;

        while( n!=0 ){
            n = stdIn.nextInt();
            System.out.println(i + "回目の入力した値は" + n + "です.");
            System.out.println("直前に入力した値は" + nprev + "です.");
            nprev = n;
            i++;
        }
        stdIn.close();
    }
}