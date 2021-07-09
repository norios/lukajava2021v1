public class k1202 {
    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }
        System.out.println();
    }
    public static void copy( double[] v, double [] ret){
        for (int i=0; i< v.length; i++){
            ret[i] = v[i];
        }

    }
    public static void main(String []args){
        double[] x = {3.1,4.1,5.9,2.6};
        double[] y ;
        double[] u = {3.1,4.1,5.9,2.6};
        double[] v = new double[u.length];
        
        y=x;
        y[1] = 2.7;
        show("source1",x);
        show("reference",y);

        copy(u,v);
        v[1] = 2.7;
        show("source2",u);
        show("reference",v);

    }
}
