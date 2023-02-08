package spring.otus.kryzh.hometask1.classes;

import lombok.Data;
import spring.otus.kryzh.hometask1.interfaces.QuestionsDao;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionDaoImpl implements QuestionsDao {

    private CsvLoader csvLoader;
    @Override
    public List<Question> findAll() {
        List<Question> questions = new ArrayList<>();
        String allData = csvLoader.readFromInputStream();
        String[] rows = allData.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String[] columns = rows[i].split(",");
            Question question =  new Question();
            question.setStatement(columns[0]);
            question.setQuestionNumber(i);
            questions.add(question);
        }
        System.out.println(questions);
        return questions;
    }
}
