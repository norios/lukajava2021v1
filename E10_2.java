public class E10_2 {
    public static void main(String [] args){
        Rect r = new Rect();
        r.w = 7;
        r.h = 3;
        r.area = r.w * r.h;
        r.length = (r.w*2) + (r.h*2);

        System.out.println("面積：" + r.area);
        System.out.println("辺の長さ：" + r.length);

    }
}

    class Rect{
        int w;
        int h;
        int area;
        int length;
    }

