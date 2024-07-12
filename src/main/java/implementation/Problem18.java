package implementation;

import java.util.stream.IntStream;

/**
 * 모의고사 <p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Problem18 {

    private static final int[] FIRST_PERSON_ANSWER = {1, 2, 3, 4, 5};
    private static final int[] SECOND_PERSON_ANSWER = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] THIRD_PERSON_ANSWER = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int[] scores = new int[] {
                getAnswerCount(answers, FIRST_PERSON_ANSWER),
                getAnswerCount(answers, SECOND_PERSON_ANSWER),
                getAnswerCount(answers, THIRD_PERSON_ANSWER)
        };

        final int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        return IntStream.range(0, 3)
                .filter(i -> scores[i] == max)
                .map(i -> i + 1)
                .toArray();
    }

    private int getAnswerCount(final int[] answers, final int[] personAnswers) {
        return (int) IntStream.range(0, answers.length)
                .filter(i -> answers[i] == personAnswers[i % personAnswers.length])
                .count();
    }

}
