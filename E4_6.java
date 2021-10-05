import java.util.Scanner;
public class E4_6 {
    public static void main(String [] args){
        int sum = 0;
        int i ;
        Scanner input = new Scanner(System.in);
        while(true){
            
            i =  input.nextInt();
            if (i >0){
                sum +=i;
            }else{
                System.out.println(sum);
                break;
            }

        }
        input.close();
    }
}
