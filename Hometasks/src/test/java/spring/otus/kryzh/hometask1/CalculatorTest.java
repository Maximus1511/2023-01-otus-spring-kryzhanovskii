package spring.otus.kryzh.hometask1;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void checkAddMethod() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }
}