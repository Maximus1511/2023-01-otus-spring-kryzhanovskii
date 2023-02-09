package spring.otus.kryzh.hometask1.interfaces;

import spring.otus.kryzh.hometask1.classes.Question;

import java.util.List;

public interface QuestionsDao {

    List<Question> findAll();
}
