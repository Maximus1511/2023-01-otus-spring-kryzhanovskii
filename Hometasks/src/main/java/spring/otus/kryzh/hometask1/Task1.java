package spring.otus.kryzh.hometask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.otus.kryzh.hometask1.classes.QuestionDaoImpl;

public class Task1 {
    public static void main(String[] args){
       ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");

        QuestionDaoImpl questionDao = context.getBean(QuestionDaoImpl.class);
        questionDao.findAll();
    }
}
