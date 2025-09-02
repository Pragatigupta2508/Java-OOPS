
class Bank {
	void deposit(int amt) {
		System.out.println("Deposit through cash");
	}
	
	void deposit(int amt, String cheque) {
		System.out.println("Deposit through cheque");
	}
	
	void deposit(int amt, String upiid, String name) {
		System.out.println("Deposit through upi");
	}
}

public class bank {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.deposit(500);
		b.deposit(500, "23rh");
		b.deposit(500, "79@ybvdfh", "krish");
	}
}