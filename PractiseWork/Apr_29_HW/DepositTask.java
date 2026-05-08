package Apr_29_HW;

import java.util.concurrent.Callable;

public class DepositTask implements Callable<Void> {
    /* Bank Account Synchronization (synchronized block and method)
        Objective
        Learn how to avoid race conditions using synchronized.

        Problem Statement
        Implement a BankAccount class with a balance.
        Create multiple threads representing depositors and withdrawers.
        Simulate a race condition where multiple users deposit and withdraw simultaneously.
        Fix the issue using:
        synchronized blocks
        Measure execution time with and without synchronization. */

    BankAccountSyncTask bankaccount;

    public DepositTask(BankAccountSyncTask bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<100000;i++)
            bankaccount.deposit(i);

        return null;
    }
}

