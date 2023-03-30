interface IAccount{

    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);

}

class HDFCAccount implements IAccount{
    double balance;
    double withdrawls;

    public double getBalance() {
        return balance-withdrawls;
    }
    public void deposit(double amount ){
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
}
class StateBankAccount implements IAccount{
    double balance;

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount ){
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
}

public class Main {
    public static void main(String[] args){
        IAccount obj = new HDFCAccount();
        System.out.println("Transacting on account HDFC");
        transactionOnAccount(obj);

        System.out.println("Transacting on account State Bank");
        IAccount obj1 = new StateBankAccount();
        transactionOnAccount(obj1);

    }

    public static void transactionOnAccount(IAccount account){

        System.out.println("-------------------------------");
        account.deposit(10000.0);
        printBalance("deposting 1000.0",account);
        account.withdraw(2000.0);
        printBalance("withdrawing 2000.0",account);
        account.withdraw(200.0);
        printBalance("withdrawing 200.0",account);
        account.deposit(4000.0);
        printBalance("depositing 4000.0",account);
        System.out.println("-------------------------------");

    }

    public static void printBalance(String message , IAccount account){
        System.out.println("The balance after "+ message+" is "+ account.getBalance()+".");
    }
}