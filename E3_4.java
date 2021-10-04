import java.util.Scanner;
public class E3_4{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("日付：");
        int day = input.nextInt();
        System.out.println("税抜き価格：");
        int price = input.nextInt();
        if (day <= 19890331) {
            System.out.println("価格は" + price + "円です");
        } else if (day <= 19970331) {
            System.out.println("価格は" + (int)(price * 1.03) + "円です");
        } else if (day <= 20140331) {
            System.out.println("価格は" + (int)(price * 1.05) + "円です");
        } else if (day <= 20190930) {
            System.out.println("価格は" + (int)(price * 1.08) + "円です");
        } else if (day <= 19970331) {
            System.out.println("価格は" + (int)(price * 1.03) + "円です");
        } else {
            System.out.println("価格は" + (int)(price * 1.10) + "円です");     
        }
        input.close();
    }

}