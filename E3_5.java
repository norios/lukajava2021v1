import java.util.Scanner;
public class E3_5{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int hand = input.nextInt();
        switch (hand) {
            case 0:
                System.out.println("負け");
                break;
            case 1:
                System.out.println("あいこ");
                break;
            case 2:
                System.out.println("勝ち");
                break;
            default:
                System.out.println("判定不能");
        }

        input.close();
    }

}