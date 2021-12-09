import java.util.Scanner;
public class E7_0a {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("答え="+ calc(n));
        input.close();
    }

    public static int calc(int n){
         int ans = 0;
        try{
          ans = 50 / n;
        } catch(ArithmeticException e){
            System.out.println("0で割れません");
        } finally{
            System.out.println("calcメソッド終了");
        }
        return ans ;
    }
}