import java.util.Scanner;
public class E4_5 {
    public static void main(String [] args){
        String[] month = new String[] {"睦月","如月","弥生","卯月","皐月","水無月","文月","葉月","長月","神無月","霜月","師走"};
        Scanner input = new Scanner(System.in);
        System.out.println("X:");
        int range =  input.nextInt();
        if (range <= 0 || range > 12  ){
            System.out.println("エラー"); 
        }else{
            for (int i=0; i<=11; i++)
            if (range == i+1) {
                System.out.println(month[i]);
            }
            input.close();
        }
    }
}
