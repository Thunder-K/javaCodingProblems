import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("코딩 개념 잡는 자바코딩 문제집 시작");

        System.out.println("1. 문자 개수 세기");
        Map<Character, Integer> characterIntegerMap = conuntDuplicateCharacters("dwdwd12e1ded@@#@$@!D!");
        System.out.println(characterIntegerMap.toString());
        Map<Character, Long> characterIntegerMap2 = conuntDuplicateCharacters2("dwdwd12e1ded@@#@$@!D!");
        System.out.println(characterIntegerMap2.toString());

        System.out.println("2. 반복되지 않는 첫 번째 문자 찾기");
        System.out.println(firstNonRepeatedCharacter("asbvefaaeklmlkrm@#@$!dqdw"));

    }

    public static char firstNonRepeatedCharacter(String str) {

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }

        for(Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println("??? >> " + entry.toString());
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;

    }

    public static Map<Character, Long> conuntDuplicateCharacters2(String str) {

        Map<Character, Long> result2 = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result2;

    }

    public static Map<Character, Integer> conuntDuplicateCharacters(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for(char ch : str.toCharArray()) {

            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);

        }

        return result;

    }

}
