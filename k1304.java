
public class k1304 {
    public static void show(String name, double [][] m){
                
        System.out.println(name + "=");
        for (int v=0; v<m.length; v++){
            for (int i=0; i< m[v].length; i++){
                System.out.print(m[v][i]+ "\t");
            }
            System.out.println();
        }
        
        
    }


    public static double[][] exchange(double[][] a,double[] b, int c){
        double[][] ret  =new double[a.length][a[0].length];

        for (int i=0; i < a.length; i++){
            for (int v=0; v < a[i].length; v++){
                if (v+1 == c){
                    ret[i][v] = b[i];

                }
                else{
                    ret[i][v] = a[i][v] ;

                }

            }

        }
        return ret;

    }

    public static void main(String []args){
        double[][] a = {{3.1,4.1,5.9},{2.6,5.3,8.9},{7.9,3.5,6.4}};
        double[] b = {2.7,1.8,2.8};

        show("matrix",a);
        double[][] c = exchange(a,b,1);
        show("exchange",c);
        
    }
}