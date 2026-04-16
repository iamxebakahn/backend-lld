//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    BankAccount acc = new BankAccount("Zeba", 500);
    acc.deposit(200);
    acc.withdraw(100);
    acc.withdraw(700);
    acc.printTransactionHistory();
}
