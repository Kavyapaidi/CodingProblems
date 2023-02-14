import java.util.stream.Stream;

public class Fibonacci_Lambda {
    public static void main(String[] args) {
        Stream.iterate(new int[] { 0, 1 }, p -> new int[] { p[1], p[0] + p[1] })
                .limit(10)
                .forEach(p -> System.out.println(p[0]));
    }
}
