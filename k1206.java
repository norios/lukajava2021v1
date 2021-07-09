public class k1206 {
    public static void show(String name, double [][] m){
                
        System.out.println(name + "=");
        for (int v=0; v<m.length; v++){
            for (int i=0; i< m[v].length; i++){
                System.out.print(m[v][i]+ "\t");
            }
            System.out.println();
        }
        
    }

    public static void main(String []args){
        double[][] a = {{3.1,4.1,5.9},{2.6,5.3,8.9},{7.9,3.5,6.4}};
        show("matrix",a);
        
    }
}