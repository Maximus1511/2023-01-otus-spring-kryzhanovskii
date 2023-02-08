package spring.otus.kryzh.hometask1.classes;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

@Data
public class CsvLoader {
    private String pathToCsvFile;
    private String dataFromCsv;

    private LinkedHashMap<Question, List<Answer>> map;
        public String readFromInputStream () {
        ClassLoader classLoader =  Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(getPathToCsvFile());
        StringBuilder stringBuilder =  new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while (true) {
            try {
                if ((line = bufferedReader.readLine()) == null) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuilder.append(line).append("\n");
        }
        dataFromCsv = stringBuilder.toString();
        return  stringBuilder.toString();
    }

        public LinkedHashMap<Question, List<Answer>> parserDataFromCsv(String dataFromCsv) {
            String[] strings = dataFromCsv.split("\n");
            for (int i = 0; i < strings.length; i++) {
                Question question = new Question();
                question.setQuestionNumber(i);
                String[] arr = strings[i].split(",");
                question.setStatement(arr[0]);

                Answer answer = new Answer();
                String[] ans = new String[arr.length - 1];
                System.arraycopy(arr, 1, ans, 0, arr.length - 1);
                answer.setAllAnswers(Arrays.asList(ans));
                //List<Answer> answers = Arrays.asList(ans);
                //map.put(question, answer);
            }
            return null;
        }
}
