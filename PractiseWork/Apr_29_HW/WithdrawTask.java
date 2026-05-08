package Apr_29_HW;

import java.util.concurrent.Callable;

public class WithdrawTask implements Callable<Void> {
    BankAccountSyncTask bankaccount;

    public WithdrawTask(BankAccountSyncTask bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<100000;i++)
            bankaccount.withdraw(i);

        return null;
    }
}
