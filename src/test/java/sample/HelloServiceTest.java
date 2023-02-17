package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloServiceTest {
    private HelloService target = new HelloService();
    @Test
    void testHello() {
        var expected = "Hello";
        var actual = target.hello();
        assertEquals(expected, actual);
    }
}
