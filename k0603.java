import java.util.Scanner;
public class k0603 {
    public static void main(String []args){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i) + " -> " + (int)s.charAt(i));
        }
        
        stdIn.close();
    }
    
}
