package spring.otus.kryzh.hometask1.interfaces;

import spring.otus.kryzh.hometask1.classes.Answer;
import spring.otus.kryzh.hometask1.classes.Question;

import java.util.List;
public interface AnswerDao {
    List<Answer> findAll(Question question);
}
