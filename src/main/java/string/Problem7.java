package string;

/**
 * 이상한 문자 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
public class Problem7 {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(" ");
                index = 0;
                continue;
            }

            sb.append(toUpperLowerCase(index, ch));
            index++;
        }
        return sb.toString();
    }

    private char toUpperLowerCase(final int index, final char ch) {
        return index % 2 == 0
                ? Character.toUpperCase(ch)
                : Character.toLowerCase(ch);
    }

}
