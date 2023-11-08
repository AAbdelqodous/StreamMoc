package q47;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        var list = List.of("MANGO", "BANANA", "ORANGE", "PEARS", "GRAPES");
        Predicate<String> predicate = str -> {
            int ctr = 1;
            boolean result = str.indexOf("N") != -1;
            System.out.print(ctr++ + ".");
            return result;
        };

        list.stream()
                .filter(predicate)
                .sorted(); // as sorted() is an intermediate operation,
        // hence stream is not evaluated and you don't get any output on to the console.
    }
}
