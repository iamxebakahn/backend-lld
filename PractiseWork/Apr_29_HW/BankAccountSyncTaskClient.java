package Apr_29_HW;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BankAccountSyncTaskClient {
    public static void main(String[] args) throws Exception{
        BankAccountSyncTask account = new BankAccountSyncTask(1000000);
        ExecutorService es=Executors.newCachedThreadPool();
        Future<Void> future = es.submit(new DepositTask(account));
        Future<Void> future1 = es.submit(new WithdrawTask(account));
        future.get();
        future1.get();

        System.out.println("Account Balance"+account.balance);
    }
}
