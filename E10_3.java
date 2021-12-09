public class E10_3 {
    public static void main(String [] args){
        Circle c = new Circle();
        c.r = 3;
        c.area = c.r * c.r * Math.PI;
        c.arc = (c.r * 2) * Math.PI;

        System.out.println("円の面積：" +c.area);
        System.out.println("円周：" +c.arc);

    }
}

    class Circle{
        int r;
        double area;
        double arc;
    }

