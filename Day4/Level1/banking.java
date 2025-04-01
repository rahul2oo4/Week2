
class BankAccount {
	String accNo;
	double bal;

	BankAccount(String a, double b) {
    	accNo = a;
    	bal = b;
	}
}

class SavingsAccount extends BankAccount {
	double rate;

	SavingsAccount(String a, double b, double r) {
    	super(a, b);
    	rate = r;
	}

	void displayAccountType() {
    	System.out.println("Savings Account");
	}
}

class CheckingAccount extends BankAccount {
	double limit;

	CheckingAccount(String a, double b, double l) {
    	super(a, b);
    	limit = l;
	}

	void displayAccountType() {
    	System.out.println("Checking Account");
	}
}

class FixedDepositAccount extends BankAccount {
	int duration;

	FixedDepositAccount(String a, double b, int d) {
    	super(a, b);
    	duration = d;
	}

	void displayAccountType() {
    	System.out.println("Fixed Deposit Account");
	}
}

public class banking {
	public static void main(String[] args) {
    	SavingsAccount s = new SavingsAccount("S123", 1000.0, 4.5);
    	CheckingAccount c = new CheckingAccount("C456", 2000.0, 500.0);
    	FixedDepositAccount f = new FixedDepositAccount("F789", 5000.0, 12);

    	s.displayAccountType();
    	c.displayAccountType();
    	f.displayAccountType();
	}
}

