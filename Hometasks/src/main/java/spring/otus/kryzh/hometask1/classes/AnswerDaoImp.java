package spring.otus.kryzh.hometask1.classes;

import lombok.Data;
import spring.otus.kryzh.hometask1.interfaces.AnswerDao;

import java.util.Arrays;

@Data
public class AnswerDaoImp implements AnswerDao {
    private CsvLoader csvLoader;
    @Override
    public Answer findAll(Question question) {
        Answer answer =  new Answer();
        String allData = csvLoader.readFromInputStream();
        String[] rows = allData.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String[] columns = rows[i].split("\\?,");
            if (columns[0].equals(question.getStatement())){
                String[] answersArr = columns[1].split(",");
                answer.setAllAnswers(Arrays.asList(answersArr));
            }
        }
        return answer;
    }
}
