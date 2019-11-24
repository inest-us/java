package us.inest.tdd.sample;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitHelloWorldTest {

    @BeforeAll
    public static void beforeAll() throws Exception {
        System.out.println("Before Class");
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() throws Exception {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }

    @AfterEach
    public void afterEach() throws Exception {
        System.out.println("After Test Case");
    }

    @AfterAll
    public static void afterAll() throws Exception {
        System.out.println("After Class");
    }
}
