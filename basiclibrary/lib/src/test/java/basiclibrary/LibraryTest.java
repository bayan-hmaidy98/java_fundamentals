/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    // test roll dice function
    @Test void testRollArrayIndices(){
        Library classUnderTest = new Library();
        int actualIndex = classUnderTest.roll(4).length;
        assertEquals(4, actualIndex);
    }
    // test contain duplicates function
    @Test void testContainDuplicate(){
        Library classUnderTest = new Library();
        boolean actualBoolean = classUnderTest.containsDuplicates(new int []{1,2,2,4});
        assertTrue(actualBoolean, "Failed");
    }

    @Test void testFindingAverage (){
        Library classUnderTest = new Library();
        float actualAverage = classUnderTest.findingAverage(new int [] {1,1,1,1});
        assertEquals(1, actualAverage);
    }
    @Test void testLeastAverage(){
        Library classUnderTest = new Library();
        int [] actualArray = classUnderTest.leastAverage(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        });
        assertEquals(new int [] {55, 54, 60, 53, 59, 57, 61}, actualArray);
    }

}
