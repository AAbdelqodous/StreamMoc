package q24;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(null); //Line n1
        System.out.println(optional.orElse(-1)); //Line n2
    }
}
