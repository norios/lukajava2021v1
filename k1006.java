public class k1006 {

    public static void main(String[]args){
        int vec1[] = {1,2,3};
        int vec2[] = {4,5,6};
        int rs = 0;

        for (int i=0; i <vec1.length;i++){
            rs = rs + (vec1[i] * vec2[i]);
        }
        System.out.println("Resut: " + rs);

    }
}