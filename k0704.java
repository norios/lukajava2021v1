import java.util.Scanner;
public class k0704 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);  
        int n =1;
        int i = 1;
        int max = Integer.MIN_VALUE;
        n = max;

        while( n!=0 ){
            if (max < n) max = n;
            n = stdIn.nextInt();
            System.out.println(i + "回目の入力した値は" + n + "です.");
            i++;
        }

        System.out.println("入力の最大値は" + max + "です.");
        stdIn.close();

    }
}