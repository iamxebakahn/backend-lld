package Apr_29_HW;

import java.util.concurrent.Callable;

public class WebScrapperTask implements Callable<Void> {
    private String url;

    public WebScrapperTask(String url) {
        this.url=url;
    }

    @Override
    public Void call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" scraping "+url);
        Thread.sleep(200);
        System.out.println("Website Loaded "+url);
        return null;
    }
}
