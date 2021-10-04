import java.util.Scanner;
public class E3_2{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        if (a % 3 == 0) {
            System.out.println(a + "は3の倍数です");
        } else if (a % 3 != 0) {
            System.out.println(a + "は3の倍数ではありません");
        }
        input.close();
    }

}