interface IAccount{

   double getBalance();

   void deposit(double amount );

   void withdraw(double amount);

}

class HDFCAccount implements IAccount{

    double balance ;
    double withdraw;

    public double getBalance(){
        return (balance - withdraw);
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }

}
class stateBankAccount implements IAccount{

    double balance ;

    public double getBalance(){
        return (balance);
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
}

class TestAccountInterface{

    public static void printBalance(String msg, IAccount account){
        System.out.println("The balance after "+msg+" is "+account.getBalance());
    }
    public static void transactionAccount(IAccount account){
        System.out.println("--------------------");
        account.deposit(10000.0);
        printBalance("deposting 10000",account);
        account.withdraw(4000.0);
        printBalance("withdrwaing 4000",account);
        account.withdraw(2000.0);
        printBalance("withdrwaing 2000",account);
        account.deposit(5000.0);
        printBalance("depositing 10000",account);
    }
    public static void main(String s[]){

        System.out.println("Transaction Using HDFC Bank");
        IAccount account = new HDFCAccount();
        transactionAccount(account);
        System.out.println("Transaction using STATE Bank");
        IAccount accountt = new stateBankAccount();
        transactionAccount(accountt);

    }
}
