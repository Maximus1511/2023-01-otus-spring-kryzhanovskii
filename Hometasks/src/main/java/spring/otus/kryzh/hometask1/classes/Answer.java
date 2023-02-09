package spring.otus.kryzh.hometask1.classes;

import lombok.Data;

import java.util.List;

@Data
public class Answer {
    private List<String> allAnswers;
    private String correctAnswer;
    boolean showCorrectAnswer;

    @Override
    public String toString() {
        findCorrectAnswer();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < allAnswers.size(); i++) {
            if (showCorrectAnswer) {
                stringBuilder.append("\t" + (i + 1) + ". " + allAnswers.get(i) + "\n");
            } else {
                stringBuilder.append("\t" + (i + 1) + ". " + allAnswers.get(i).split("\\(correct\\)")[0] + "\n");
            }

        }
        return stringBuilder.toString();
    }

    public void findCorrectAnswer() {
        for (String singleAnswer : allAnswers) {
            String[] array = singleAnswer.split("(\\*)");
            if (array.length > 1) {
                correctAnswer = array[1];
                break;
            }
        }
    }
}
