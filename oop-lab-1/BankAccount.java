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
		System.out.println("Negative amount cannot be deposited in bank account!");

}

//withdraw method
public void withdraw(double amount)
{
	if(balance<amount)
		System.out.println("Your bank account doesnot have enough balance to withdraw your requested amount! ");
	else
	{
		balance=balance - amount;
		//System.out.print("Amount withdrawn: "+ amount);
		transactions.add("Withdrew $"+ amount);
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