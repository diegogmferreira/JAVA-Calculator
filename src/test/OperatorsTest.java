package src.test;

import src.main.Operators;
import static org.junit.jupiter.api.Assertions.*;

class OperatorsTest {

    Operators data = new Operators();

    @org.junit.jupiter.api.Test
    void sum() {
        double result;
        result = (double)data.sum(15,14);

        assertEquals(29.0, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        double result;
        result = (double)data.subtract(15,14);

        assertEquals(1.0, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        double result;
        result = (double)data.multiply(2,0);

        assertEquals(0.0, result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        double result;
        result = (double)data.divide(15,3);

        assertEquals(5, result);
    }
}