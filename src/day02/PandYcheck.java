package day02;

public class PandYcheck {

    static boolean solution(String s) {
        int countp = 0;
        int county = 0;
        boolean answer = true;
        for(int i =0;i < s.length();i++){
           char p = s.charAt(i);
           char y = s.charAt(i);
           if(p == 'p' || p == 'P'){
               countp++;
           } else if (y == 'y' || y == 'Y') {
               county++;
           }
        }
        if(countp != county)
            return false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooY"));
    }
}
