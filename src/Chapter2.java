import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Chapter2 {

    public static int evenIntegers(List<Integer> integers) {

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();

    }

    public static class Car {
        private final String name;
        private final Color color;

        public Car(String name, Color color) {
            this.name = Objects.requireNonNullElse(name, "no name");
            this.color = Objects.requireNonNullElseGet(color, () -> new Color(0,0,0));
        }

        @Override
        public String toString() {
            return this.name + " > " + this.color.toString();
        }
    }

}
