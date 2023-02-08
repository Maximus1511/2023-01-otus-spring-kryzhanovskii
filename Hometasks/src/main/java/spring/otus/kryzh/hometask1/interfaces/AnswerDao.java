package spring.otus.kryzh.hometask1.interfaces;

import spring.otus.kryzh.hometask1.classes.Answer;
import spring.otus.kryzh.hometask1.classes.Question;
public interface AnswerDao {
    Answer findAll(Question question);
}
