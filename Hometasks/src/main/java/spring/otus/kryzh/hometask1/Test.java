package spring.otus.kryzh.hometask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.otus.kryzh.hometask1.classes.TestRunner;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");

        TestRunner testRunner = context.getBean(TestRunner.class);
        testRunner.printTest();
    }
}
