public class k1306 {
        public static void show( String name, double[][] m ){}
        public static void show( String name, double[][] v ){}
        public static void show( String name, double[][] S ){}
        public static double[][] exchange( double[][] m, double[] v, int col){}
        public static double[][] cofactor( doble[][] m , int row int col){}

        public static int sign(int row, int col){}
        public static double det(double[][] m){}

        public static double[] cramer(double[][] m, double[] b){
                double[] x = new double [b.length];

                double tmp = det(m);

                for(int i=0; i<b.length; i++){
                    x[i] = det(exchange(m,b,i))  / tmp;

                }
                return x;
        }

        public static void main(String []args){
            double[][] a = {{0.3,0.1,0.4,0.1},{0.5,0.9,0.2,0.6},
                            {0.5,0.3,0.5,0.8},{0.9,0.7,0.9,0.6}};
            double[] b = {2.1,5.3,5.8,7.4};
    
            show("ans",cramer(a,b));
            
        }
    }
    
}
