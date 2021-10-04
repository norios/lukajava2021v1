import java.util.Scanner;
public class k1408 {

    public static int max( int[] n){
        int rmax =n[0];
    
        for(int i=1; i<=n.length-1; i++){

            if(n[i-1] < n[i]){
                rmax = n[i];
            }

        }
        return rmax;
    }

    public static int min( int[] n){
        int rmax =n[0];
    
        for(int i=1; i<=n.length-1; i++){

            if(n[i-1] > n[i]){
                rmax = n[i];
            }

        }
        return rmax;
    }

    public static void main(String []args){
        int[] n = new int [5];
        System.out.println("自然数を5つ入力：");

        Scanner stdIn = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.print("自然数No" + i + "：");
            n[i-1] = stdIn.nextInt();
           }
        
        System.out.println("最大値：" + max(n));
        System.out.println("最小値：" + min(n));
        stdIn.close();
    }
    
}
