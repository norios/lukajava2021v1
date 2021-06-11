public class k1001a {
    public static void main(String[]args){
        int []vec = {1,2,3,4};
        int []value = new int[vec.length];
        int []ref;

        //値によるコピー
        for (int i = 0; i<vec.length; i++){
            value[i]=vec[i];

        }

        //コピー先を編集する
        value[2]=9;

        System.out.println("Vector:");
        for(int i=0; i< vec.length; i++){
            System.out.print(vec[i] + "\t");
        }
        System.out.println("\n");

        System.out.println("値によるコピー：");
        for (int i=0; i<value.length; i++){
            System.out.print(value[i]+"\t");

        }
        System.out.println("\n");

    }
}
