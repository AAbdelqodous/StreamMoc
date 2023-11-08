package q39;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var oceanAnimals = List.of("Shark", "Squid", "Whale", "Starfish", "Lobster");
        oceanAnimals.stream()
                .parallel()
                .filter(s -> s.contains("e"))
                .findFirst()
                .ifPresentOrElse(s -> System.out.println("FOUND " + s + "!"),
                        () -> System.out.println("NOT FOUND!"));
    }
}
