import java.util.Scanner;
public class k0601 {
    public static void main(String []args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        System.out.println("1から" + n + "まで表示します.");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        stdIn.close();
    }
}
