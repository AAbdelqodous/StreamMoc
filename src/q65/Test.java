package q65;
import java.util.OptionalLong;

public class Test {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.empty();
        System.out.println(optionalLong.isPresent()+ " : " +optionalLong.getAsLong());
    }
}
