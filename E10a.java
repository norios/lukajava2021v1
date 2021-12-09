public class E10a {
    public static void main(String [] args){
        Account a = new Account();
        a.branch = 100;
        a.number = 1030;
        a.name = "青山太郎";
        a.balance = 25000;
        System.out.println("支店：" + a.branch);
        System.out.println("口座：" + a.number);
        System.out.println("名前：" + a.name);
        System.out.println("残高：" + a.balance);

    }

}
    class Account{
        int branch;
        int number;
        String name;
        int balance;
    }
