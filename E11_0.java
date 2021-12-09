public class E11_0 {
    
    public static void main(String [] args){
        Account a = new Account(100,1030,"鈴木",2500);
        System.out.println("円の面積：" +a.branch);

    }
}
class Account{
    int branch; int number; String name; int balance;
     Account(int br, int nu, String na, int ba){
        branch = br;
        number = nu;
        name = na;
        balance = ba;

    }
}


