public class k1104 {
    public static String address(String s){
        String ret= "a";
        ret = ret + s.substring(1) + "@aoyama.jp";
        return ret;
    }
    public static void main(String []args){
        System.out.println(address("15719765"));
    }
}
