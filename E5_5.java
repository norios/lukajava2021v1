import java.util.Scanner;
public class E5_5{
    public static int tax(int d, int p){

        int i;
        if (d <= 19890331) {
            i = p;                        
        } else if (d <= 19970331) {
            i = (int)(p * 1.03);
        } else if (d <= 20140331) {
            i = (int)(p * 1.05);
        } else if (d <= 20190930) {
            i = (int)(p * 1.08);
        } else {
            i = (int)(p * 1.10);
        }

        return i;
    }
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("日付：");
        int day = input.nextInt();
        System.out.println("税抜き価格：");
        int price = input.nextInt();

        System.out.println(tax(day,price) + "円です");
        
        input.close();
    }

}