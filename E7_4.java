import java.util.Scanner;
public class E7_4 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println(toDouble(input.next()));                        
        }catch(NumberFormatException e){
            System.err.println("数字に変換できません");
        }       
        input.close(); 
    }

    public static double toDouble(String n) throws NumberFormatException{
        double d = Double.parseDouble(n);
        return d;
   }

}