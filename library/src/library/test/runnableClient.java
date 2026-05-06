package library.test;
import  library.RunnerClass;

public class runnableClient {
    public static void main(String[] args) {
        for(int i=0;i<100;i++)
        {
            Thread rc= new Thread(new RunnerClass(i));
            rc.start();
        }

    }
}
