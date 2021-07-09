public class k1204 {
    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }
        System.out.println();
    }
    public static double[] mul( double s, double[] v){
        double[] ret =new double[v.length];
        for (int i=0; i< v.length; i++){
            ret[i] = v[i] * s;
        }
        return ret;
    }
    
    public static void main(String []args){
        double[] x = {3.1,4.1,5.9,2.6};
        double[] y ;
        
        y=mul(2.5,x);
        show("source",x);
        show("result",y);

    }
}
