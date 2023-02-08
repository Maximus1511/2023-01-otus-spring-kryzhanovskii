package spring.otus.kryzh.hometask1.classes;

import lombok.Data;
import spring.otus.kryzh.hometask1.interfaces.AnswerDao;
import spring.otus.kryzh.hometask1.interfaces.QuestionsDao;

import java.util.List;

@Data
public class TestRunner {
    private QuestionsDao questionsDao;
    private AnswerDao answerDao;


    private void printFullAnswers(Question question){
        System.out.print(answerDao.findAll(question));
    }

    public void printTest(){
        List<Question> questionList = questionsDao.findAll();
        for (Question question: questionList) {
            System.out.println(question + "?");
            printFullAnswers(question);
            System.out.println("--------------------------------------------");
        }
    }
}
