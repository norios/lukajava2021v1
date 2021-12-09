import java.util.Scanner;
public class E7_5 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("キーボードから合算するデータを入力");
            int[] ary = new int[5];
            int idx = 0;
            do{
                try{
                    int data = toInteger(input.next());
                    if(data <= 0 ){
                        break;
                    }
                    ary[idx] = data;
                    idx++;
    
                }catch(NumberFormatException e){
                System.err.println("NumberFormatException例外発生");
                return;
                }catch(ArrayIndexOutOfBoundsException e){
                    System.err.println("ArrayIndexOutOfBoundsException例外発生");
                    return;
                }
                input.close(); 
            }while(true);
            
            System.out.println("合算する要素数を入力");
            idx = input.nextInt();
            int sum = 0;
            for(int i= 0; i < idx; i++){
                sum += ary[i];
            }
            System.out.println("合計："+sum);
            
    }
    
    public static Integer toInteger(String j) throws NumberFormatException{
        Integer i = Integer.parseInt(j);
        return i;
   }

}