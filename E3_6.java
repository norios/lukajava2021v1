import java.util.Scanner;
public class E3_6{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int hand = input.nextInt();

        if (hand == 0) {
            System.out.println("負け");
        } else if (hand == 1) {
            System.out.println("あいこ");
        } else if (hand == 2) {
            System.out.println("勝ち");
        } else{
            System.out.println("判定不能");
        }
        input.close();
    }

}