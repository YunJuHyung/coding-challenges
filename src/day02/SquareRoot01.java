package day02;

public class SquareRoot01 {
    public static long solution(long n) {
        //long 타입 double로 형변환 -> double타입으로 제곱근을 구하는 math메소드 사용가능
        //if(n > 0) return  int x (x + 1) = double. math(n)
        //else return -1
        //   int x = (int) Math.sqrt(sqrt);
        //위의 코드에서 Math.sqrt(sqrt)는 제곱근 값을
        // double로 계산하는 부분입니다. (int)는 계산된 제곱근 값을
        // int로 형변환하는 부분입니다. 이렇게 형변환된 값을 x에 할당하게 됩니다
        //주의해야 할 점은 형변환으로 인해 소수점 이하 값이 잘려날 수 있으며,
        // 소수점 이하 값을 보존하고 싶다면 다른 방식으로 처리해야 합니다. 형변환으로 인해 발생하는 데이터 손실에 유의하시기 바랍니다.
        long answer = 0;
       Double sqrt = Math.sqrt(n); // n의 제곱근을 구한뒤 int 타입으로 바로 형변환
        System.out.println(sqrt);
        if(sqrt % 1 == 0){
            answer = (long)Math.pow(sqrt + 1, 2);
        } else answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }

}
