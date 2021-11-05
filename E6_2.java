public class E6_2 {
    public static int sum(int [] s){
        int total = 0;
        for(int i=0; i< s.length; i++){
            total = total + s[i];
        }
        return total;
    }

    public static double mean(int [] s){
        return (double)sum(s)/ s.length;
    }
    public static void main(String [] args){

        int[] x = {1,2,3,4,5,6,6,7,8,9,10};

        System.out.println("sum : "+ sum(x));
        System.out.println("mean: "+ mean(x));
        ;
    }
}