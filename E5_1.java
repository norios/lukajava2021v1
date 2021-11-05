public class E5_1 {
    public static void main(String [] args){
        String a = "5";
        String b = "2.4";

        System.out.println("aの2乗は"+ (int)Math.pow(Integer.parseInt(a),2));
        System.out.println("bの2乗は"+ Math.pow(Double.parseDouble(b),2));
    }
}