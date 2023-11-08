package q51;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Olive", "Middle East"));
        list.add(new Fruit("Mango", "India"));
        list.add(new Fruit("Cranberry", "North America"));
        list.add(new Fruit("Watermelon", "Africa"));
        list.add(new Fruit("Peach", "China"));
        list.add(new Fruit("Fig", "Middle East"));
        list.add(new Fruit("Blueberry", "North America"));

//        list.stream().sorted().forEach(System.out::println);
//        list.stream().sorted( new Fruit()).forEach(System.out::println);
//        list.stream().sorted( new Fruit().reversed()).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing( f -> f.countryOfOrigin, Fruit::comp)).forEach(System.out::println);
    }
}
