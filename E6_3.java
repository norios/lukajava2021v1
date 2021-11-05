public class E6_3 {
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

    public static double var(int [] s){
        double mean = mean(s);
        double ssum = 0.0;
        for (int i = 0; i < s.length; i++){
            ssum += (s[i] - mean) * (s[i] - mean); 
        }

        return ssum/ s.length;
    }
    public static void main(String [] args){

        int[] x = {1,2,3,4,5,6,6,7,8,9,10};

        System.out.println("sum : "+ sum(x));
        System.out.println("mean: "+ mean(x));
        System.out.println("var : "+ var(x));
        ;
    }
}