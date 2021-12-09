public class E9_2{
	public static void main(String[] args){
		String data = "import java.util.Scanner; public class Main{ public static void main(String[] args){ Scanner input = new Scanner (System.in); System.out.println(\"日付を入力\"); int day = input.nextInt(); System.out.println(\"税抜き価格を入力\"); int price = input.nextInt(); if(day < 19890401){ System.out.println(\"価格は\" + price + \"円です\"); } else if(day < 19970401){ System.out.println(\"税込み価格は\" + (int)(price * 1.03) + \"円です\"); } else if(day < 20140401){ System.out.println(\"税込み価格は\" + (int)(price * 1.05) + \"円です\"); } else if(day < 20191001){ System.out.println(\"税込み価格は\" + (int)(price * 1.08) + \"円です\"); } else{ System.out.println(\"税込み価格は\" + (int)(price * 1.10) + \"円です\"); } }}";
		// 以下にプログラムを記述
        int cnt = 0;
        int IndxNum = 0;
        for(int i=0; i< data.length(); i++){
            IndxNum = data.indexOf("println",i);
            if(IndxNum != -1){
                cnt++;
                i = IndxNum;
            }
        }
        System.out.println("printlnの数：" + cnt);
	}
	
}
