import java.util.concurrent.* ;
import java.util.List;
import java.util.ArrayList;


public class DownloadClient {
    public static void main(String[] args) throws Exception{
        List<String> files = List.of("file1","file2","file3","file4","file5","file6","file7");
        ExecutorService executor= Executors.newFixedThreadPool(3);
        List<Future<String>> futurelist= new ArrayList<>();

        long starttime= System.currentTimeMillis();
        for(String file:files)
        {
            DownloadTask task =new DownloadTask(file);
            Future<String> future = executor.submit(task);
            futurelist.add(future);
        }


        for(Future<String> future : futurelist)
        {
            System.out.println(future.get());
        }
        long endtime= System.currentTimeMillis();

        System.out.println("Total time:"+ (endtime-starttime)+"ms");

        executor.shutdown();



    }
}
