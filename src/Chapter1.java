import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter1 {

    public static Map<Character, Integer> no1countDuplicateCharacter1(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);

        }

        return result;

    }

    public static Map<Character, Long> no1countDuplicateCharacter2(String str) {

        return str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    }

    public static int no7ValueOf(String str) {
        return Integer.valueOf(str);
    }

    public static String no12RemoveDuplicates(String str) {
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }

}
