import java.util.Scanner;
public class E7_0e {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);        
        try{
            System.out.println("答え="+ calc(input.next()));
        } catch(ArithmeticException e){
            System.err.println("Arithmetic例外発生");
        }catch(NumberFormatException e){
            System.err.println("NumberFormat例外発生");

        }
        input.close();
    }

    public static int calc(String n) throws ArithmeticException,NumberFormatException{
         int ans = 50 / Integer.parseInt(n);
         return ans;
    }
}