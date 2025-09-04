
class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private int accountNumber;
    private double balance;
    private int pin;

    public BankAccount(int accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount, int pin) 
            throws InsufficientBalanceException, InvalidPinException {
        if (pin != this.pin) {
            throw new InvalidPinException("Invalid Pin");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public double getBalance(int pin) throws InvalidPinException {
        if (pin != this.pin) {
            throw new InvalidPinException("Invalid Pin");
        }
        return balance;
    }
}


public class main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 1000.0, 1234);
        try {
            account.deposit(500.0);
            System.out.println("Balance: " + account.getBalance(1234));
            account.withdraw(2000.0, 1234); 
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

