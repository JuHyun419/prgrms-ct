package recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * 모음 사전 <p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/84512
 */
public class Problem17 {

    private static final char[] CHARS = "AEIOU".toCharArray();

    public int solution(String word) {
        return generate("").indexOf(word);
    }

    private List<String> generate(String word) {
        List<String> words = new ArrayList<>();
        words.add(word);

        if (word.length() == CHARS.length) return words;

        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }

        return words;
    }

}
