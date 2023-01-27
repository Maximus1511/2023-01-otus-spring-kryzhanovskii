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
        StringBuilder stringBuilder =  new StringBuilder();
        for (int i = 0; i < allAnswers.size(); i++) {
            stringBuilder.append("\t"+ (i + 1) + ". " + allAnswers.get(i) + "\n");
        }
        return stringBuilder.toString();
    }
}
