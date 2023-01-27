package spring.otus.kryzh.hometask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.otus.kryzh.hometask1.classes.Blank;
import spring.otus.kryzh.hometask1.classes.Student;

public class Task1 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");

        Student student =  context.getBean(Student.class);
        student.setName("Maxim Kryzhanovskii");
        Blank blank =  context.getBean(Blank.class);
        blank.setStudentName(student.getName());
        blank.fill();
        blank.printBlank();
    }
}
