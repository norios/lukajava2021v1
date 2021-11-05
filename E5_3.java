import java.util.Scanner;
public class E5_3{
    public static double circuit(int r){
        double mm;
        mm = r * Math.PI;
        return mm;
    }
    public static void main(String [] args){
        int r;
        Scanner input = new Scanner(System.in);
        r =  input.nextInt();
        System.out.println(r +"の円周は"+ circuit(r));
        input.close();
    }
   
}