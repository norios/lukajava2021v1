import java.util.Scanner;
public class E7_3 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        try{

            double d = Double.parseDouble(input.next());
            System.out.println(d);
        }catch(NumberFormatException e){
            System.err.println("数字に変換できません");
        }
        input.close();
    }

}