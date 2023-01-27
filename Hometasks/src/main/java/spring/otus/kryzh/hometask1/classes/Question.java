package spring.otus.kryzh.hometask1.classes;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    int questionNumber;
    private String statement;

    @Override
    public String toString() {
        return "Q" + questionNumber + ". " + statement;
    }
}
