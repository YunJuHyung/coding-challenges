package day03;

public class HashadNumber {
    public static boolean solution(int x) {
        int num = x;
        int sum = 0;

        while(num!=0){
            sum += num % 10;  //num == 12 나머지는 2 //1 % 10  나머지 1
            num /= 10;      //num = 1

        }
        return x % sum == 0 ? true : false;

    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
