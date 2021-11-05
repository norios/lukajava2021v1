import java.util.Scanner;
public class E5_2 {
    public static double inchiToMm(int x){
        double mm;
        mm = x * 25.4;
        return mm;
    }
    public static void main(String [] args){
        int i;
        Scanner input = new Scanner(System.in);
        i =  input.nextInt();
        System.out.println(i +"インチは"+ inchiToMm(i)+"mm");
        input.close();
    }
   
}