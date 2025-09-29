class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

public class Main3 {
    private String acc_name;
    private double bal;

    public Main3(String name, double openbal) throws InvalidAmountException {
        if (openbal < 0) {
            throw new InvalidAmountException("Opening balance can't be negative");
        }
        this.acc_name = name;
        this.bal = openbal;
    }

    public void withdraw(double amt, int pin) throws InsufficientFundsException {
        if (amt <= 0) {
            throw new InsufficientFundsException("Withdraw amount must be positive");
        }
        if (amt > bal) {
            throw new InsufficientFundsException("Insufficient funds: short by " + (amt - bal));
        }
        bal = bal - amt;
        System.out.println("Withdrawn amount: " + amt + " | Remaining balance: " + bal);
    }

    public void deposit(double amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        bal = bal + amt;
        System.out.println("Deposited amount: " + amt + " | New balance: " + bal);
    }

    public double getbal() {
        return bal;
    }

    public static void main(String[] args) {
        Main3 sofia = new Main3("sofia", 1000.45);

        try {
            sofia.withdraw(2000.45, 0);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Parent exception class: " + e.getMessage());
        } finally {
            System.out.println("Your Session expired");
        }

        try {
            sofia.deposit(-200);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit error: " + e.getMessage());
        }

        System.out.println("Final Balance of " + sofia.acc_name + " = " + sofia.getbal());
    }
}
