import java.util.Scanner;
public class k0701 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        
               System.out.print("点数を入力してください:");
        
               int nscore = stdIn.nextInt();

               System.out.print("出席回数を入力してください:");
        
                int nattendance = stdIn.nextInt();

                System.out.println("点数は" + nscore + "と入力されました.");
                System.out.println("出席回数は" + nattendance + "と入力されました.");


                int nevalscore =0;                
                if(nscore >= 90) {
                    nevalscore = 5;                                        
                }else if (nscore >= 80){
                    nevalscore = 4;
                }else if (nscore >= 70){
                    nevalscore = 3;
                }else if (nscore >= 60){
                    nevalscore = 2;
                }else {
                    nevalscore = 1;                        
                }                       
            
                int nevalattendance =0;                
                if(nattendance >= 10) {
                    nevalattendance = 5;                                        
                }else if (nattendance >= 7){
                    nevalattendance = 4;
                }else if (nattendance >= 5){
                    nevalattendance = 3;
                }else if (nattendance >= 2){
                    nevalattendance = 2;
                }else {
                    nevalattendance = 1;                        
                }                       

                int ngrade = 0;                    
                if (nevalscore >= nevalattendance){
                    ngrade = nevalattendance ;   
                }else{
                    ngrade = nevalscore;       
                }                    
                
                String sgrande ="" ;
                if (ngrade == 5) {
                    sgrande = "A" ;                       
                }else if (ngrade == 4) {
                    sgrande = "B" ;                       
                }else if (ngrade == 3) {
                    sgrande = "C" ;                       
                }else if (ngrade == 2) {
                    sgrande = "D" ;                       
                }else {
                    sgrande = "E" ;                       
                }

                System.out.println("あなたの成績は" + sgrande + "です.");

                stdIn.close();
    }
}