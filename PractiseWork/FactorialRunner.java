import java.math.BigInteger;

public class FactorialRunner implements Runnable{
    private long number;
    private BigInteger answer;
    private boolean finished;

    @Override
    public void run()
    {
        for(long i=2;i<=number;i++)
        {
            answer=answer.multiply(BigInteger.valueOf(i));
        }

        finished=true;
    }
    public FactorialRunner(long number){
        this.number=number;
        this.answer=BigInteger.valueOf(1);
        this.finished=false;
    }

    public BigInteger getAnswer(){
        return answer;
    }

    public boolean isFinished(){
        return finished;
    }
}
