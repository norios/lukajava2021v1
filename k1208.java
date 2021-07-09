public class k1208 {
    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }
        System.out.println();
    }

    public static double[] part( double[] v, int row){
        double[] ret =new double[v.length-row] ;
        int i2;
        i2 =0;
        for (int i=0; i< v.length; i++){
            if(i == row){
                continue;
            }
            ret[i2] = v[i];
            i2=i2+1;
        }
        return ret;
    }

    public static void main(String []args){
        double[] x = {3.1,4.1,5.9,2.6};
        double[] y;

        y=part(x,1);
        show("source",x);
        show("part",y);
        
    }
}