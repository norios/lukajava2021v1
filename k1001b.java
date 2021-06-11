public class k1001b {
    public static void main(String[]args){
        int []vec = {1,2,3,4};
        int []ref;

        //参照によるコピー
        ref = vec;

        //コピー先を編集する
        ref[2] = 9;

        System.out.println("Vector:");
        for(int i=0; i< vec.length; i++){
            System.out.print(vec[i] + "\t");
        }
        System.out.println("\n");

        System.out.println("参照によるコピー：");
        for (int i=0; i<ref.length; i++){
            System.out.print(ref[i]+"\t");

        }
        System.out.println("\n");

    }
}
