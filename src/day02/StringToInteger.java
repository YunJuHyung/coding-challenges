package day02;

public class StringToInteger {
    public static int solution(String s) {
                int answer;
                if (s.charAt(0) == '+') {
                    answer = Integer.parseInt(s.substring(1));
                } else {
                    answer = Integer.parseInt(s);
                }
                return answer;
            }

            public static void main(String[] args) {
                StringToInteger solution = new StringToInteger();
                System.out.println(solution.solution("1234")); // 출력: 1234
                System.out.println(solution.solution("-1234")); // 출력: -1234
                System.out.println(solution.solution("+1234")); // 출력: +1234
            }
        }

