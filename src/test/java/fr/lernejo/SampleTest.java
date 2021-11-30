package fr.lernejo;
import org.junit.jupiter.api.Assertions;

class SampleTest {
    Sample sample;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sample = new Sample();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        sample = null;
    }

    @org.junit.jupiter.api.Test
    void op() {
        int a = 4;
        int b = 2;
        Assertions.assertEquals(sample.op(Sample.Operation.ADD, a, b),6);
        Assertions.assertEquals(sample.op(Sample.Operation.MULT, a, b), 8);
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Assertions.assertEquals(sample.fact(5),120);
        Assertions.assertThrows(IllegalArgumentException.class, ()->sample.fact(-1));
    }
}
