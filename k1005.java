public class k1005 {

    public static void main(String[]args){
        double vec[] = {3.14,1.59,6.53,5.89,7.96,4.33,8.32,7.95};

        for  (int j=0; j< vec.length-1; j++){
            for  (int i=0; i< vec.length-1; i++){
                if (vec[i] > vec[i+1]){
                    double d = vec[i];
                    vec[i] = vec[i+1] ;
                    vec[i+1] = d;       
                }
            }
        }
        for (int i=0; i< vec.length; i++){
            System.out.print(vec[i]+ "\t");
        }

    }
}