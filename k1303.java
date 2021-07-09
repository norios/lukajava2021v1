public class k1303 {
    public static void show(String name, double [][] m){
                
        System.out.println(name + "=");
        for (int v=0; v<m.length; v++){
            for (int i=0; i< m[v].length; i++){
                System.out.print(m[v][i]+ "\t");
            }
            System.out.println();
        }
        
        
    }

    public static void show(String name, double [] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            System.out.print(v[i]+ "\t");
        }
        System.out.println();
    }

    public static void show(String name, double  s){
                
        System.out.println(name + "=");
        System.out.println(s);
        
    }

    public static void main(String []args){
        double[][] a = {{3.1,4.1,5.9},{2.6,5.3,8.9},{7.9,3.5,6.4}};
        double[] b = {2.7,1.8,2.8};
        double c = 1.4;

        show("matrix",a);
        show("vector",b);
        show("scalar",c);
        
    }
}