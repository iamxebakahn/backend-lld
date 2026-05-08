package Apr_29_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MillionNumberSumClient
{
    public static void main(String[] args) throws Exception{
        //Find sum of million numbers
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores:" + cores);
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        int chunksize = arr.length / cores;
        List<Future<Long>> futureList = new ArrayList<>();

        for (int i = 0; i < cores; i++) {
            int start = i * chunksize;
            int end = start + chunksize;
            Print_sum task = new Print_sum(arr,start,end);
            Future<Long> future_token = executor.submit(task);
            futureList.add(future_token);
        }

        long totalSum = 0;
        for (Future<Long> future : futureList) {
            totalSum += future.get();
        }

        System.out.println("Total Sum:" + totalSum);
        executor.shutdown();

    }
}
