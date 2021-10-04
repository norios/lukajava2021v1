import java.util.Scanner;
public class k2021092301{
public static void main(String [] args){
Scanner input = new Scanner (System.in);
String s = input.next();
String s2 = "";
for(int i=0; i<s.length(); i++){
    char c = (char)((int)s.charAt(i)-32);
    s2 = s2 + c;
        }
System.out.println(s2);
input.close();
    }
}

