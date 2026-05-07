import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
    private String filename;

    public DownloadTask(String filename) {
        this.filename = filename;
    }

    @Override
    public String call() throws Exception {

        for(int i=0;i<=100;i+=20)
        {
            Thread.sleep(300);
            System.out.println(Thread.currentThread().getName()+" downloading "+filename+" progress: "+i+"%");
        }
        return filename+" downloaded successfully!";
    }
}
