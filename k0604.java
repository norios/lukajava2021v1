import java.util.Scanner;
public class k0604 {
    public static void main(String []args){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                System.out.println(s.charAt(i)+" -> 大文字");
            }else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                System.out.println(s.charAt(i)+" -> 小文字");
            }

        }
        
        stdIn.close();
    }
    
}
