public class k1205 {
    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }
        System.out.println();
    }
    public static double mulhv( double[] h, double[] v){
        double ret;
        ret = 0;
        for (int i=0; i< v.length; i++){
            ret = ret + (h[i] * v[i]);
        }
        return ret;
    }
    
    public static void main(String []args){
        double[] a = {3.1,4.1,5.9};
        double[] b = {2.6,5.3,8.9};

        show("h vector",a);
        show("v vector",b);

        double y = mulhv(a,b);
        System.out.println("result=" + y);

    }
}