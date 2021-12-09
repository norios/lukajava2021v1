import java.util.Scanner;
public class test10 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();   

        Circle c = new Circle(r);
    
        System.out.println("円の面積：" +c.area);
        System.out.println("円周：" +c.arc);
    input.close();
    }
}

    class Circle{
        int r;
        double area;
        double arc;
        Circle(int r2){
            r = r2;
            area = r * r * Math.PI;
            arc = (r * 2) * Math.PI;

        }
        
    }

