import java.util.Scanner;
public class E5_6{
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

        int n = 1;
        while( n!=0 ){
            System.out.println("税抜き価格：");
            int price = input.nextInt();
            if (price ==0 ) break;
            System.out.println(tax(day,price) + "円です");
        }
        input.close();
    }

}