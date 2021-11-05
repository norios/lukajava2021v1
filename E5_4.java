public class E5_4{
    public static void main(String [] args){
        int x = 10;
        int y = 5;
        setInt(x,y);
        System.out.println("x = "+ x);
        // xの値が10のままなのは、関数setInitへの引数が値渡しのため。
        System.out.println("y = "+ y);
    }
    public static void setInt(int x, int y){
        x = y;
    }
   
}