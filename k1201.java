public class k1201 {
    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }

    }

    public static void main(String []args){
        double[] x = {3.1,4.1,5.9,2.6};
        show("vector",x);

    }
}
