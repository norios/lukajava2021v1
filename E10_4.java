public class E10_4 {
    public static void main(String [] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        
        p1.name = "りんご";
        p1.price = 100;
        p1.num = 3;
        p1.psum = p1.price * p1.num;
        p2.name = "みかん";
        p2.price = 50;
        p2.num = 5;
        p2.psum = p2.price * p2.num;
        p3.name = "バナナ";
        p3.price = 80;
        p3.num = 2;
        p3.psum = p3.price * p3.num;

        int sum = p1.psum + p2.psum + p3.psum;

        System.out.println("合計金額：" + sum + "円");        

    }
}

    class Product{
        String name;
        int price;
        int num;       
        int psum;
    }

