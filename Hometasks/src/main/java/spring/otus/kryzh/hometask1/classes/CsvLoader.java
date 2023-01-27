package spring.otus.kryzh.hometask1.classes;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Data
public class CsvLoader {
    private String pathToCsvFile;
    private String dataFromCsv;
        public void readFromInputStream () {
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
    }
}
