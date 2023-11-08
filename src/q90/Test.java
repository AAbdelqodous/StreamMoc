package q90;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Test {
    public static void main(String[] args) {
        var a = DoubleStream.iterate(Double.valueOf(1.0), i -> i <= 3.0, i -> i + 1);
        var b = a.mapToObj( i -> "" + i)
                .collect(Collectors.joining(","));
        System.out.println(b);
    }
}
