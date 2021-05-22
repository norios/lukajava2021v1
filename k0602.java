import java.util.Scanner;
public class k0602 {
    public static void main(String []args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int sum = 0;
        System.out.println("1から" + n + "までの合計を求めます.");
        for(int i=1; i<=n; i++){
            sum +=i;
        }
        System.out.println(sum);
        stdIn.close();
    }
    
}
