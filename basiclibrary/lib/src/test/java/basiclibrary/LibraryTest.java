/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    // @Test void someLibraryMethodReturnsTrue() {
    //     Library classUnderTest = new Library();
    //     assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    // }

    @Test public void testRoll() {
        int [] rollResult = Library.roll(5);
        assertEquals( 5, rollResult.length);
    }

    @Test public void testContainsDuplicates() {
        int [] array ={1,2,5,4,5,9,8,2,10};
        assertTrue(Library.containsDuplicates(array));
    }

    @Test public void testCalcAverage() {
        int [] array ={65, 56, 55, 52, 55, 62, 57};
        assertTrue(Library.calculatingAverages(array) ==57.0);
    }

    @Test public void testArrayOfArrays() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int [] array = weeklyMonthTemperatures[2];
        int [] newArr = Library.arrayOfArrays(weeklyMonthTemperatures);
        assertArrayEquals(array, newArr);
    }
}