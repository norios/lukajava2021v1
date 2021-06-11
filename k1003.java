
public class k1003 {
    public static void main(String[]args){
        double vec[] = {3.14,1.59,6.53,5.89,7.96,4.33,8.32,7.95};

        if (vec[0] > vec[1]){
                double d = vec[0];
                vec[0] = vec[1] ;
                vec[1] = d;       
        }

        for (int i=0; i< vec.length; i++){
            System.out.print(vec[i]+ "\t");
        }

    }
}