package spring.otus.kryzh.hometask1.classes;

import lombok.Data;

import java.util.*;

@Data
public class Blank {
    private List<Question> questions;
    private String studentName;
    private CsvLoader csvLoader;
    private HashMap<Question, Answer> map;


    public Blank(String studentName) {
        this.studentName = "Unknown";
        map = new HashMap<>();
    }

    public void printBlank() {
        System.out.println("Name: " + studentName + "\n------------------\n");
        map.entrySet().forEach(map -> System.out.println(map.getKey() + "\n" + map.getValue()));
    }

    public void fill() {
        csvLoader.readFromInputStream();
        String data = csvLoader.getDataFromCsv();
        String[] strings = data.split("\n");
        for (int i = 0; i < strings.length; i++) {
            Question question = new Question();
            question.setQuestionNumber(i);
            String[] arr = strings[i].split(",");
            question.setStatement(arr[0]);

            Answer answer = new Answer();
            String[] ans = new String[arr.length - 1];
            System.arraycopy(arr, 1, ans, 0, arr.length - 1);
            answer.setAllAnswers(Arrays.asList(ans));
            map.put(question, answer);
        }
    }
}
