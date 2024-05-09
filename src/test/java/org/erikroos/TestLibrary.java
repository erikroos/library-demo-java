package test.java.org.erikroos;

import main.java.org.erikroos.Library;
import org.junit.jupiter.api.*;

public class TestLibrary {
    private Library testLibrary;

    @BeforeAll
    public static void setUpClass() {
        // code executed before all test methods
    }

    @BeforeEach
    public void setUp() {
        // code executed before each test method
        testLibrary = new Library(3);
    }

    @Test
    public void testNrOfBookCases() {
        Assertions.assertEquals(3, testLibrary.getNrOfBookCases());
        Assertions.assertNotEquals(0, testLibrary.getNrOfBookCases());
    }

    @AfterEach
    public void tearDown() {
        // code executed after each test method
    }

    @AfterAll
    public static void tearDownClass() {
        // code executed after all test methods
    }
}
