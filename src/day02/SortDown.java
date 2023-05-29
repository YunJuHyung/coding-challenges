package day02;

import java.util.Arrays;
import java.util.Collections;


public class SortDown {
    public static long solution(long n){
        //Arrays.sort 사용하려면 String[]타입이여야함 근데 문자열 하나하나씩
        //나눠야 sort정렬으로 구분하니깐 split("")을 사용해 구분짓는다.
        //long n 을 String[]으로 변환 -> Arrays.sort(문자열변수명, Collections.reverseOrder());
        // -> 배열의 인덱스 순으로 문자열을 하나씩 뽑아서 빈 문자열에 저장 ->

        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        //생성된 배열은 = ["4", "5", "6", "7"];
        String sl = "";

        for(String s : str){
            sl += s;
        }
        answer = Long.parseLong(sl);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(345567));
    }
}
