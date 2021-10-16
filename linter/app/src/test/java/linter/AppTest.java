/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void testEmpty() throws IOException {

        App classUnderTest = new App();
        String output = classUnderTest.linter(Path.of("emptyFile.js"));

        assertEquals("", output);
    }
    @Test void testOneError() throws IOException {

        App classUnderTest = new App();
        String output = classUnderTest.linter(Path.of("errorFile.js"));
        String expected = "Line 1: Missing semicolon\n";
        assertEquals(expected, output);
    }
    @Test void testManyErrors() throws IOException {

        App classUnderTest = new App();
        String output = classUnderTest.linter(Path.of("errorFile2.js"));
        String expected = "Line 1: Missing semicolon\n" +"Line 4: Missing semicolon\n" +"Line 7: Missing semicolon\n" + "Line 10: Missing semicolon\n";
        assertEquals(expected, output);
    }

    @Test void testNoErrors() throws IOException {

        App classUnderTest = new App();
        String output = classUnderTest.linter(Path.of("noError.js"));
        String expected = "";
        assertEquals(expected, output);
    }

}
