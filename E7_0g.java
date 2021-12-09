public class E7_0g {

    public static void test(){
        
        // int n = 0;
        try{
            //ans = 50 / n;
        } catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("--------------");
            System.out.println(e.getMessage());
            System.out.println("--------------");
            e.printStackTrace();
        }

    }
    public static void main(String [] args){
        test();
        
    }
}