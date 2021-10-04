import java.util.Scanner;
public class E3_3{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        switch (a % 3) {
            case 0:
                System.out.println(a + "は3の倍数です");
                break;
            default:
                System.out.println(a + "は3の倍数ではありません");
        }

        input.close();
    }

}