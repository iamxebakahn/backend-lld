public class BankAccount
{

private double balance;
private String ownerName;

public void deposit(double amount)
{
	if(amount>0)
	{
		balance = balance + amount;
		System.out.print("Amount deposited: "+ amount);
	}
	
	else
		System.out.print("Negative amount cannot be deposited in bank account!");		

}

public void withdraw(double amount)
{
	if(balance<amount)
		System.out.print("Your bank account doesnot have enough balance to withdraw your requested amount! ");
	else
	{
		balance=balance - amount;
		System.out.print("Amount withdrawn: "+ amount);
	}

}

public double getBalance()
{
	return balance;
}

public void setBalance(double balance)
{
	this.balance=balance;
}

public String getOwnerName()
{
	return ownerName;
}

public void setOwnerName(String name)
{
	this.ownerName=name;
}


}