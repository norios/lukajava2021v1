public class E4_2 {
    public static void main(String [] args){
        int sum = 0;
        for (int i=1; i<=15; i++)
            if (i % 3 ==0) {
                System.out.println(i);
                sum += i;
            }
            System.out.println("合計: " + sum);
        }
}
