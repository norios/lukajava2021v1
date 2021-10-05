import java.util.Scanner;
public class E4_7 {
    public static void main(String [] args){
        String[] products = new String[] {"Coffee","Tea","Juice","GreenTea"};
        int[] price = new int[]  {100,160,120,130};

        Scanner input = new Scanner(System.in);
        System.out.println("金額を入力：");
        int coin =  input.nextInt();
        System.out.println("商品名を入力：");
        String drink = input.next();

        for (int i=1; i<=products.length; i++){
            if (drink.equals(products[i-1]) ) {
                if (coin >= price[i-1]){
                    System.out.println("おつりは" + (coin-price[i-1]) + "円です。");
                    System.exit(0);
                }
                else if (coin < price[i-1]){
                    System.out.println((price[i-1]-coin) + "円不足です。");
                    System.exit(0);
                }
            }
        }

        System.out.println(coin + "円返金です。");

        input.close();
    }
}
