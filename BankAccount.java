abstract class BankAccount {
    int acc_num;
    double balance;
    abstract void withdraw();
    abstract void deposit();
    void getBalance(double balance)
    {
        this.balance=balance;
        System.out.println("Balance: "+balance);
    }

}
class CheckingAccount extends BankAccount{
    void withdraw()
    {
        System.out.println("Withdrawing amount: 5000");
    }

    void deposit()
    {
        System.out.println("Depositing amount: ");
    }


}

class Main_6{
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount=new CheckingAccount() ;
        bankAccount.withdraw();
        bankAccount.deposit();
        bankAccount.getBalance(5500.5);

    }
}
