import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest extends TestCase {

    App app;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public void setUp() {
        app = new App();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public void tearDown() {
        app = null;
        System.setOut(standardOut);
    }

    public void testPrintNumbers() {
        app.printNumbers();

        assertEquals(
                "1,2,3,4,5,6,7,8,9,10",
                outputStreamCaptor.toString()
        );
    }

    public void testCalculateArea() {
        assertEquals(216.0, app.calculateArea(18, 24, 30));
        assertEquals(249.41531628991834, app.calculateArea(24, 24, 24));
    }



}