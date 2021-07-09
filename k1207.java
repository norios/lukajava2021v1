public class k1207 {
    public static void show(String name, double [][] m){
                
        System.out.println(name + "=");
        for (int v=0; v<2; v++){
            for (int i=0; i< m.length+1; i++){
                System.out.print(m[v][i]+ "\t");
            }
            System.out.println();
        }
        
    }

    public static double[][] copy2( double [][] m){
        double[][] ret =new double[m.length][m[0].length];

        for (int v=0; v <m.length; v++){
            for (int i=0; i< m[0].length; i++){
                ret[v][i] = m[v][i];
            }
        }
        return ret;
    }

    public static void copy1( double [][] m, double[][] ret){
        for (int v=0; v <m.length; v++){
            for (int i=0; i< m[0].length; i++){
                ret[v][i] = m[v][i];
            }
        }
    }
    public static void main(String []args){
        double[][] a = {{3.1,4.1,5.9},{2.6,5.3,8.9}};
        double[][] b = new double [a.length][a[0].length];
        double[][] c;

        show("matrix",a);
        copy1(a,b);
        show("copy1",b);
        c = copy2(a);
        show("copy2",c);
        
    }
}