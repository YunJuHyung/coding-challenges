package day02;

import java.util.Arrays;

public class StringOpposite {
    public static int[] solution(long n) {
            //스트링 타입에서 charAt(i)로 해당하는 문자 하나씩 뽑아서
            // int[] answer 에 할당
            // 뒤집어서 배열로 저장해야한다

        String arr = Long.toString(n);
        int[] answer =new int[arr.length()]; // answer 배열의 크기는 5
        for(int i =arr.length() - 1;i >=0;i--){
            answer[arr.length() -1 -i] = arr.charAt(i) -'0';
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] result = solution(12345);
        System.out.println(Arrays.toString(result));
    }
}
