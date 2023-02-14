import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorial_Lambda {
    public static void main(String[] args) {
        int n=5;
        System.out.println(IntStream.range(1,n+1)
                .reduce(1,(int x,int y)->x*y));
        System.out.println(LongStream.range(1,n+1)
                .reduce(1,(long x,long y)->x*y));
        System.out.println(IntStream.rangeClosed(1,n)
                .reduce(1,(int x,int y)->x*y));
        System.out.println(LongStream.rangeClosed(1,n)
                .reduce(1,(long x,long y)->x*y));
    }
}
