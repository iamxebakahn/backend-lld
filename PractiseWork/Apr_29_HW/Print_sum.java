package Apr_29_HW;
import java.util.concurrent.Callable;

public class Print_sum implements Callable<Long> {
    //Find sum of million numbers
    private int[] arr;
    private int start;
    private int end;

    public Print_sum(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception{
        long sum=0;

        for(int i=start;i<end;i++)
            sum+= arr[i];

        return sum;
    }
}
