public class E10_1 {
    public static void main(String [] args){
        Account a = new Account();
        Account b = new Account();
        a.branch = 100;
        a.number = 1030;
        a.name = "青山太郎";
        a.balance = 25000;
        b.branch = 80;
        b.number = 2548;
        b.name = "相模花子";
        b.balance = 300000;

        System.out.println("支店番号" + "\t" + "口座番号"  + "\t" +  "名義" + "\t" + "残高");        
        System.out.println(a.branch + "\t" + a.number + "\t" + a.name + "\t" + a.balance);
        System.out.println(b.branch + "\t" + b.number + "\t" + b.name + "\t" + b.balance);

    }
}

    class Account{
        int branch;
        int number;
        String name;
        int balance;
    }

