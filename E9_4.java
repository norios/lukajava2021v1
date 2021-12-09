import java.util.Scanner;
public class E9_4 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String word[] ={"","","","",""};
        for(int i=0; i< 5; i++){
            System.out.println("単語" + (i+1) + "番目を入力：");
            word[i] = input.next();
        }

        int bigcount = 0;
        int littlecount = 0;        
        for(int i=0; i< 5; i++){
            if (Character.isUpperCase( word[i].charAt( 0 ) )) {
                bigcount++;
            }
            else  if (Character.isLowerCase( word[i].charAt( 0 ) )) {
                littlecount++;
            }
        }

        System.out.println("大文字から始まる英単語は" + bigcount + "個,小文字から始まる英単語は" + littlecount + "個");
        input.close();
    }
}