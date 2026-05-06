package library;

public class RunnerClass implements Runnable{
    int num;
    @Override
    public void run()
    {
        System.out.println("Number "+this.num+" from thread:"+ Thread.currentThread().getName());
    }

    public RunnerClass(int num)
    {
        this.num=num;
    }
}
