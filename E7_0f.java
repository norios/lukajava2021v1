import java.util.Scanner;
public class E7_0f {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  
        int n = input.nextInt();              
        try{
            System.out.println("答え="+ calc(n));
        } catch(ArithmeticException e){
            System.err.println(e);
        }
        input.close();
    }

    public static int calc(int n) throws ArithmeticException{
        if (n==0)
            throw new ArithmeticException();
         int ans = 50 / n;
         return ans;
    }
}