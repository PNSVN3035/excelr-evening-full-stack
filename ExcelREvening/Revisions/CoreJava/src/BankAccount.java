public class BankAccount 
{
	private int balance;
	public BankAccount(int initialBalance)
	{
		assert initialBalance >= 0 : "Initial balance must be non-negative";
		this.balance = initialBalance;
	}

	public void deposit(int amount)
	{
		assert amount > 0 : "Deposit amount must be positive";
		balance += amount;
	}

	public void withdraw(int amount)
	{
		assert amount > 0 : "Withdraw amount must be positive";
		assert balance - amount >= 0 : "Insufficient funds";
		balance -= amount;
	}

	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount(10000);
		System.out.println("one");
		ba.withdraw(5000);
		System.out.println("two");
		ba.deposit(5000);
		System.out.println("three");
		ba.withdraw(6000);
		System.out.println("four");
		ba.withdraw(6000);
		System.out.println("five");
	}
}
