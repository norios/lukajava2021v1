import java.util.Scanner;
public class k1406 {

    public static String fact( int n){
        String sum = "";
    
        for(int i=1; i<n; i++){
            sum = sum + "○";
        }
        return sum + "x";
    }


    public static void main(String []args){
        System.out.print("自然数を入力：");
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for(int i=n; i>=1; i=i-1){
            System.out.println(fact(i));
        }
        stdIn.close();
    }
    
}
