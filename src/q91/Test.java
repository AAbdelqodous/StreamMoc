package q91;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String str = Stream.of("an", "and", "after", "or", "before")
                .takeWhile(s -> s.length() < 4)
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
