package q36;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println(Stream.of(10, 0, -10)
                                .sorted()
                                .findAny()
                                .orElse(-1));
    }
}
