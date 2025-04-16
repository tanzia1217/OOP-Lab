import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank$ {
    double balance;


    public void withdraw (double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Balance is not Available");
            } else {
                this.balance = balance - amount;
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}

    class Main_Bank$ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        Bank$ bank$ = new Bank$();
        bank$.balance = 5000.0;
        bank$.withdraw(amount);

    }
}
