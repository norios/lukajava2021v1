import java.util.Scanner;
public class E4_4 {
    public static void main(String [] args){
        int sum;
        sum = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("範囲");
        int range =  input.nextInt();
        if (range <= 0 ){
            System.out.println("エラー"); 
        }else{
            for (int i=1; i<=range; i++)
            if (i % 3 ==0) {
                System.out.println(i);
                sum += i;
            }
            System.out.println("合計: " + sum);
            input.close();
        }
    }
}
