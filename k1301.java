public class k1301 {
    public static void show(String name, double [][] v){
                
        System.out.println(name + "=");
        for (int i=0; i< v.length; i++){
            for (int i2=0; i2< v[0].length; i2++){
                System.out.print(v[i][i2]+ "\t");
            }
            System.out.println();

        }
        
    }

    public static double[][] cofactor( double[][] m, int row, int col){
        double[][] ret =new double[m.length-1][m[0].length-1];
        
        int v2=0;
        for (int v=0; v < m.length; v++){
          
            if (v !=row){
                int i2 = 0;
                for (int i=0; i< m[0].length; i++){
                    
                    if (i != col){
                        ret[v2][i2] = m[v][i];
                        i2= i2+1;
                    }
                    else{
                        continue;
                    }
                }
                v2 = v2+1;

            }
            else{
                continue;
            }

        }
        return ret;

    }


    public static void main(String []args){
        double [][] a = {{3.1,4.1,5.9}, {2.6,5.3,8.9},{7.9,3.5,6.4}};
        double [][] b;

        show("matrix",a);
        b= cofactor(a,1,1);
        show("copy1",b);
      
    }
}