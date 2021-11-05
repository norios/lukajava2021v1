import java.util.Scanner;
import java.util.Random;
public class E5_7{

    public static String convertTe(int i){
        String Te="";        
        if(i==0) Te = "グー";
        if(i==1) Te = "チョキ";
        if(i==2) Te = "パー";
        return Te;
    }

    public static String janken(int i,int x){
        String result = "";
        if (i == x) result = "あいこ";        
        else if (i == 0 && x == 1) result = "勝ち";
        else if (i == 0 && x == 2) result = "負け";
        else if (i == 1 && x == 0) result = "負け";
        else if (i == 1 && x == 2) result = "勝ち";
        else if (i == 2 && x == 0) result = "勝ち";
        else if (i == 2 && x == 1) result = "負け";

        return result;
    }

    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("プレイヤーの手を入力");
        System.out.println("グー：0, チョキ：1, パー：2");
        int i = input.nextInt();

        Random rand = new Random();
        int x = rand.nextInt(3);

        System.out.println("プレイヤーが出した手："+convertTe(i));
        System.out.println("コンピュータが出した手："+convertTe(x));

        System.out.println(janken(i,x));

        input.close();
    }

}