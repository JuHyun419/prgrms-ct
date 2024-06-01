package string;

/**
 * 이진 변환 반복하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class Problem10 {

    public int[] solution(String s) {
        int count = 0;
        int zero = 0;

        while (!s.equals("1")) {
            count++;
            zero += zeroCount(s);
            s = removeZero(s);
            s = toBinary(s.length());
        }

        return new int[]{count, zero};
    }

    private int zeroCount(String s) {
        return (int) s.chars()
                .filter(c -> c == '0')
                .count();
    }

    private String removeZero(String s) {
        return s.replaceAll("0", "");
    }

    private String toBinary(final int number) {
        return Integer.toString(number, 2);
    }
}
