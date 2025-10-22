package LAB;

class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;

	BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	void displayInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Acount Holder: " + accountHolder);
		System.out.println("Account Balance: " + balance);
	}
}

public class Lab4_p11 {
	public static void main(String args[]) {
		BankAccount ac1 = new BankAccount(1, "Shafkat", 50000);
		ac1.displayInfo();

		System.out.println("\nDepositing 18000");
		ac1.deposit(18000);
		ac1.displayInfo();

		System.out.println("\nWithdrawing 10000");
		ac1.withdraw(10000);
		ac1.displayInfo();
		
		System.out.println();
		
		ac1.withdraw(60000);
		ac1.displayInfo();
	}
}
