public class k0707 {
    public static void main(String[] args) throws Exception {
        double val = 1;
        double sum = 0;

        for (int n = 1;n<=10;n++){            
            System.out.println("a" + n + " = " + val);
            sum += val;                
            val = val/n;
        }
        System.out.println("合計は" + sum);
    }
}