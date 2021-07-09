public class k1302 {
    public static String address(String s){
        String ret= "a";
        ret = ret + s.substring(1) + "@aoyama.jp";
        return ret;
    }
    public static int sum(int x){
        if (x == 0)
            return 0;

        return x + sum(x-1);


    }
    public static void main(String []args){
        sum(10);
        System.out.println(sum(10));
    }
}