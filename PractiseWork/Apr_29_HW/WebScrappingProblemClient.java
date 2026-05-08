package Apr_29_HW;
import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;

public class WebScrappingProblemClient {
    public static void main(String[] args)  throws Exception {

    /*
        Objective -
        Understand the difference between FixedThreadPool and CachedThreadPool by simulating a web scraper.

        Problem Statement -
        Given a list of 100 URLs (e.g., "http://example.com/pageX"), simulate fetching the page content using Thread.sleep(200ms).
        Implement two versions:
        Use a FixedThreadPool(10) to process 10 URLs at a time.
        Use a CachedThreadPool to process them dynamically.
        Compare the execution time for both approaches.

        Solution
        A web scraper is a program that extracts data from websites. Since scrapers are independent of each other, we can execute them in parallel.
        Each task (a single thread's job) is to scrape a single URL. We use Callable<Void> instead of Runnable to know when the task is over.

        In the Client class:

        Create a list of dummy URLs.
        Initialize two executors: FixedThreadPool(10) and CachedThreadPool().
        Submit the tasks and record execution time for each executor.
        Use Future.get() to wait for all tasks.

        If you use Runnable instead of Callable, you cannot wait for completion. The loop ends almost immediately.
        */
        List<String> urls= new ArrayList<>();
        for(int i=1;i<=100;i++)
            urls.add("https://example.com/page"+i);

        System.out.println("------------------Testing Fixed Thread Pool(10)----------------------");

        ExecutorService executor= Executors.newFixedThreadPool(10);
        long FixedThreadPoolStart= System.currentTimeMillis();
        List<Future<Void>> FixedThreadPoolFuturesList = new ArrayList<>();
        for(String url: urls)
        {
            WebScrapperTask task= new WebScrapperTask(url);
            Future<Void> future = executor.submit(task);
            FixedThreadPoolFuturesList.add(future);
        }

        for(Future<Void> future:FixedThreadPoolFuturesList)
        {
            future.get();
        }

        long FixedThreadPoolEnd=System.currentTimeMillis();
        long FixedThreaPoolTime=FixedThreadPoolEnd-FixedThreadPoolStart;

        System.out.println("Fixed Thread Pool(10) time:"+ FixedThreaPoolTime+"ms");
        executor.shutdown();

        System.out.println("------------------Testing CachedThreadPool------------------------");

        ExecutorService executor2 = Executors.newCachedThreadPool();

        long CachedThreadPoolStart= System.currentTimeMillis();
        List<Future<Void>> cachedThreadPoolFuturesList = new ArrayList<>();
        for(String url:urls)
        {
            WebScrapperTask task = new WebScrapperTask(url);
            Future<Void> future= executor2.submit(task);
            cachedThreadPoolFuturesList.add(future);
        }

        for (Future<Void> future:cachedThreadPoolFuturesList)
        {
            future.get();
        }

        long CachedThreadPoolEnd= System.currentTimeMillis();

        long CachedThreadPoolTime = CachedThreadPoolEnd-CachedThreadPoolStart;
        System.out.println("Cached Thread Pool time:"+ CachedThreadPoolTime+"ms");
        executor2.shutdown();
        System.out.println("----------------Result----------------------");
        System.out.println("Fixed Thread Pool(10) time:"+ FixedThreaPoolTime+"ms");
        System.out.println("Cached Thread Pool time:"+ CachedThreadPoolTime+"ms");
        System.out.println("Cached Thread Pool is faster by:"+(CachedThreadPoolTime-FixedThreaPoolTime)+"ms");
    }
}
