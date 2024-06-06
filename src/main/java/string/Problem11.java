package string;

/**
 * 문자열 내 p와 y의 개수 <p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class Problem11 {

    boolean solution(String s) {
        s = s.toLowerCase();

        int p = s.length() - s.replace("p", "").length();
        int y = s.length() - s.replace("y", "").length();

        return p == y;
    }
}
