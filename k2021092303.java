import java.util.Scanner;
public class k2021092303{
public static void main(String [] args){
Scanner input = new Scanner (System.in);
int n = input.nextInt();
System.out.println("円周: " + circumference(n));
System.out.println("円の面積: " + circlearea(n));
input.close();
    }

public static double circumference(int x){
    return x*3.14;
    }

public static double circlearea(int x){
    return x*x*3.14;
    }
}