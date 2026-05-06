import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableClient {
    public static void main(String[] args)  throws InterruptedException{
       /* for(int i=0;i<100;i++)
        {
            Thread rc= new Thread(new RunnerClass(i));
            rc.start();
        } */

        ExecutorService e = Executors.newCachedThreadPool();
        for(int i=0;i<1000000;i++)
        {
            RunnerClass task= new RunnerClass(i);
            e.execute(task);


            if(i==600000)
                System.out.println("DEBUG");
        }

        /*
        List<Long> input_numbers=Arrays.asList(100L, 3435L, 354L, 232L, 46L, 23L, 56L);
        List<FactorialRunner> tasks= new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for(long number:input_numbers)
        {
            FactorialRunner task = new FactorialRunner(number);
            Thread t=new Thread(task);
            tasks.add(task);
            threads.add(t);
        }

        for(Thread t:threads)
        {
            t.start();
        }

        for (Thread t:threads)
        {
            t.join(2000);
        }

        for(int i=0;i<tasks.size();i++)
        {
            if(tasks.get(i).isFinished())
                System.out.println("Factorial:"+tasks.get(i).getAnswer());

            else
                System.out.println("Couldn't be calculated in 2s");
        }

        System.out.println("Main completed");

        */


    }
}
