import java.util.ArrayList;
import java.util.List;

public class BankAccount
{

private double balance;
private String ownerName;
private List<String> transactions;

//deposit method
public void deposit(double amount)
{
	if(amount>0)
	{
		balance = balance + amount;
		//System.out.print("Amount deposited: "+ amount);
		transactions.add("Deposited $"+ amount);
	}
	
	else
		transactions.add("Failed Deposit of $"+amount);

}

//withdraw method
public void withdraw(double amount)
{
	if(balance<amount)
		transactions.add("Failed withdrawl of $"+amount+" .Failed withdrwal");

	if(amount<=0)
		transactions.add("Invalid withdrawl of $"+amount);

		balance=balance - amount;
		//System.out.print("Amount withdrawn: "+ amount);
		transactions.add("Withdrew $"+ amount);
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

//Default Constructor
public BankAccount()
{
	balance =0;
	ownerName ="Default";
	transactions = new ArrayList<>();
}

//Parameterized Constructor
public BankAccount(String ownerName, double balance)
{
	this.ownerName=ownerName;
	this.balance=balance;
	transactions = new ArrayList<>();

}

public void printTransactionHistory()
{
	for(String str:transactions)
	{
		System.out.println(str);
	}
}

}