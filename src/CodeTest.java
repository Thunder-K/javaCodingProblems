import java.util.ArrayList;
import java.util.List;

public class CodeTest {

    public static int solution1(int number, int n, int m) {

        int nCheck = 0;
        int mCheck = 0;

        nCheck = number%n == 0 ? 1 : 0;
        mCheck = number%m == 0 ? 1 : 0;

        return nCheck*mCheck;
    }

    public static int[] solution2(int start_num, int end_num) {
        int[] answer = {};

        List<Integer> intList = new ArrayList<>();

        for(int i = start_num; i <= end_num; i++) {

            intList.add(i);

        }
        answer = intList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static int solution3(int n, String control) {
        int answer = 0;

        char[] arr = control.toCharArray();

        for (char c : arr) {
            if (c == 'w')
                n += 1;
            else if (c == 's')
                n -= 1;
            else if (c == 'd')
                n += 10;
            else if (c == 'a')
                n -= 10;
        }

        answer = n;

        return answer;
    }

    public static int[] solution4(int[] num_list) {
        int[] answer = {};

        int lastIndex = num_list.length - 1;
        int lastValue = 0;
        int[] add_num_list = new int[lastIndex+2];

        if(num_list[lastIndex] > num_list[lastIndex-1])
            lastValue = num_list[lastIndex] - num_list[lastIndex-1];
        else
            lastValue = num_list[lastIndex] * 2;

        int arr_num_list_index = 0;

        for(int i : num_list) {
            add_num_list[arr_num_list_index] = i;
            arr_num_list_index++;
        }
        add_num_list[add_num_list.length-1] = lastValue;

        answer = add_num_list;

        return answer;
    }

    public static int solution(int[] num_list) {
        int answer = 0;



        return answer;
    }
}
