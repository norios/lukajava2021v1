import java.util.Scanner;
public class k1405 {

    public static int fact( int n){
        int sum = n;
    
        for(int i=n-1; i>=1; i=i-1){
            sum = sum * i;
        }
        return sum;
    }


    public static void main(String []args){
        System.out.print("自然数を入力：");
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        System.out.println(n + "の階乗は" + fact(n) + "です.");
        stdIn.close();
    }
    
}
