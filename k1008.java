public class k1008 {

    public static void main(String[]args){
        int vec1[] = {1,2,3};
        int vec2[] = {4,5,6};
        int vec3[][] = new int[3][3];
 
        for (int j=0; j <vec1.length; j++){
            for (int i=0; i <vec2.length;i++){
                vec3[j][i] = vec1[j] * vec2[i];
            }
        }

        //2次元配列の値表示は最終的には不要
        for (int j=0; j <vec1.length; j++){
            for (int i=0; i <vec2.length;i++){
                System.out.println(vec3[j][i]);
            }
        }

        int rs =0;
        //多分forループで計算するんだろうなぁ
        rs = (vec3[0][0]*vec3[1][1]*vec3[2][2])+(vec3[0][1]*vec3[1][2]*vec3[2][0])+(vec3[0][2]*vec3[1][0]*vec3[2][1]);
        rs = rs-(vec3[0][2]*vec3[1][1]*vec3[2][0])-(vec3[0][1]*vec3[1][0]*vec3[2][2])-(vec3[0][0]*vec3[1][2]*vec3[2][1]);
        System.out.println("Resut: " + rs);
    }
}