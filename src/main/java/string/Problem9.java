package string;

/**
 * 3진법 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Problem9 {

    public int solution(int n) {
        final String trinaryNumber = toNumeralString(n, 3);
        final String reverseTrinaryNumber = reverse(trinaryNumber);

        return toNumeralInt(reverseTrinaryNumber, 3);
    }

    public String toNumeralString(final int number, final int radix) {
        return Integer.toString(number, radix);
    }

    public int toNumeralInt(final String number, final int radix) {
        return Integer.parseInt(number, radix);
    }

    public String reverse(final String number) {
        StringBuilder sb = new StringBuilder(number);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Problem9 p = new Problem9();
        System.out.println(p.solution(45));
    }

}
