import java.util.Scanner;
public class E9_5 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("2進数を入力：");
        String binarystring = input.next();

        char[] c = binarystring.toCharArray();

        double rslt = 0;
        int  j = 0;
        int i2 = 0;
        for(int i=binarystring.length()-1; i >= 0  ; i--){
                
                j = Integer.parseInt(String.valueOf(c[i])) ;
                rslt = rslt + (j * Math.pow(2, i2)) ;
                i2++;
        }
        input.close();
        System.out.println("2進数" + binarystring + "の10進数は" + Math.round(rslt) );
    }
}