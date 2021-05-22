import java.util.Scanner;
public class k0703 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);        
        System.out.print("2020年5月の日を入力");
        int a =stdIn.nextInt();
        String strday = "";

        switch(a%7){
            case 0:
                strday = "木曜日";
                break;
            case 1:
                strday = "金曜日";
                break;
            case 2:
                strday = "土曜日";
                break;
            case 3:
                strday = "日曜日";
                break;
            case 4:
                strday = "月曜日";
                break;
            case 5:
                strday = "火曜日";
                break;
            case 6:
                strday = "水曜日";
                break;            
            }

            System.out.print("2020年5月" + a + "日は" + strday + "です.");
            stdIn.close();
    }
}