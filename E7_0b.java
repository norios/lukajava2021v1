import java.util.Scanner;
public class E7_0b {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        try{
            int x = Integer.parseInt(input.next());
            System.out.println("答え="+ (50/x));
        } catch (ArithmeticException e){
            System.err.println("Arithmetic例外発生");
        } catch (NumberFormatException e){
            System.err.println("NumberFormat例外発生");
 
        } finally{
            System.out.println("プログラム終了");
        }
        input.close();
    }

}