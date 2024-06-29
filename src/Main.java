import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("코딩 개념 잡는 자바코딩 문제집 시작");

//        System.out.println("1. 문자 개수 세기");
//        Map<Character, Integer> result1 = Chapter1.no1countDuplicateCharacter1("12dimsfi39jdsdjw2wsds");
//        System.out.println(result1.toString());
//        Map<Character, Integer> result2 = Chapter1.no1countDuplicateCharacter1("12dimsfi39jdsdjw2wsds");
//        System.out.println(result2.toString());

//        System.out.println("7. 문자열을 int, long, float, double로 변환");
//        System.out.println(Chapter1.no7ValueOf("456"));

//        System.out.println("12. 중복 문자 제거");
//        System.out.println(Chapter1.no12RemoveDuplicates("aaaaaaaaabbbbbcccccdddddeeee"));

//        System.out.println("40. 함수형 스타일과 절차적 코드에서 null 참조 검사");
//        System.out.println(Chapter2.evenIntegers(Arrays.asList(1,2,null,4,null,16,7,null)));
//
//        System.out.println("43. null 참조 검사와 null이 아닌 기본 참조 반환");
//
//        Chapter2.Car test = new Chapter2.Car(null, null);
//        System.out.println(test.toString());

//        System.out.println("58. 문자열을 날짜와 시간으로 변환");
//        System.out.println(Chapter3.localDateParse("2024-06-23"));

        System.out.println("공배수");
        System.out.println(CodeTest.solution1(60,2,3));

        System.out.println("카운트 업");
        System.out.println(Arrays.toString(CodeTest.solution2(3, 10)));

        System.out.println("수 조작하기 1");
        System.out.println(CodeTest.solution3(0, "wsdawsdassw"));

        System.out.println("마지막 두 원소");
        System.out.println(Arrays.toString(CodeTest.solution4(new int[]{2, 1, 6})));


    }

}
