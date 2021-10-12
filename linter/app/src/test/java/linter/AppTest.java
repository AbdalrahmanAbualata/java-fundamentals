/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test public void testcheckData(){
        Path path = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");
        Path path1 = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\test1.js");
        Path path2 = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\test2.js");
        Path path3 = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\test3.js");
        Path path4 = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\test4.js");
        Path path5 = Paths.get("C:\\Users\\STUDENT\\401pro\\java-fundamentals\\linter\\app\\src\\main\\resources\\test5.js");

        String result1 = "Line3: Missing semicolon.\n" +
                "Line5: Missing semicolon.\n" +
                "Line11: Missing semicolon.\n" +
                "Line13: Missing semicolon.\n" +
                "Line15: Missing semicolon.\n" +
                "Line26: Missing semicolon.\n" +
                "Line28: Missing semicolon.\n" +
                "Line32: Missing semicolon.\n" +
                "Line36: Missing semicolon.\n" +
                "Line40: Missing semicolon.\n" +
                "Line41: Missing semicolon.\n" +
                "Line50: Missing semicolon.\n" +
                "Line51: Missing semicolon.\n" +
                "Line59: Missing semicolon.\n" +
                "Line60: Missing semicolon.\n" +
                "Line61: Missing semicolon.\n" +
                "Line62: Missing semicolon.\n" +
                "Line64: Missing semicolon.\n" +
                "Line70: Missing semicolon.\n" +
                "Line71: Missing semicolon.\n" +
                "Line72: Missing semicolon.\n" +
                "Line73: Missing semicolon.\n" +
                "Line74: Missing semicolon.\n" +
                "Line76: Missing semicolon.\n" +
                "Line77: Missing semicolon.\n" +
                "Line78: Missing semicolon.\n" +
                "Line79: Missing semicolon.\n" +
                "Line80: Missing semicolon.\n" +
                "Line82: Missing semicolon.\n" +
                "Line83: Missing semicolon.\n" +
                "Line84: Missing semicolon.\n" +
                "Line85: Missing semicolon.\n" +
                "Line86: Missing semicolon.\n" +
                "Line88: Missing semicolon.\n" +
                "Line89: Missing semicolon.\n" +
                "Line90: Missing semicolon.\n" +
                "Line91: Missing semicolon.\n" +
                "Line92: Missing semicolon.\n" +
                "Line94: Missing semicolon.\n" +
                "Line95: Missing semicolon.\n" +
                "Line96: Missing semicolon.\n" +
                "Line97: Missing semicolon.\n" +
                "Line98: Missing semicolon.\n" +
                "Line99: Missing semicolon.\n" +
                "Line100: Missing semicolon.\n" +
                "Line101: Missing semicolon.\n";

        String result2 = "";
        String result3 = "Line101: Missing semicolon.\n";
        String result4 = "Line59: Missing semicolon.\n" +
                "Line60: Missing semicolon.\n" +
                "Line61: Missing semicolon.\n" +
                "Line62: Missing semicolon.\n" +
                "Line82: Missing semicolon.\n" +
                "Line84: Missing semicolon.\n" +
                "Line91: Missing semicolon.\n" +
                "Line101: Missing semicolon.\n";

        String result5 = "Line5: Missing semicolon.\n" +
                "Line13: Missing semicolon.\n" +
                "Line15: Missing semicolon.\n" +
                "Line32: Missing semicolon.\n" +
                "Line36: Missing semicolon.\n" +
                "Line40: Missing semicolon.\n" +
                "Line51: Missing semicolon.\n" +
                "Line53: Missing semicolon.\n" +
                "Line55: Missing semicolon.\n" +
                "Line59: Missing semicolon.\n" +
                "Line60: Missing semicolon.\n" +
                "Line61: Missing semicolon.\n" +
                "Line62: Missing semicolon.\n" +
                "Line64: Missing semicolon.\n" +
                "Line65: Missing semicolon.\n" +
                "Line70: Missing semicolon.\n" +
                "Line71: Missing semicolon.\n" +
                "Line72: Missing semicolon.\n" +
                "Line73: Missing semicolon.\n" +
                "Line82: Missing semicolon.\n" +
                "Line88: Missing semicolon.\n" +
                "Line89: Missing semicolon.\n" +
                "Line90: Missing semicolon.\n" +
                "Line91: Missing semicolon.\n";

        String result6 = "";

        assertEquals(result1, App.checkErr(path));
        assertEquals(result2, App.checkErr(path1));
        assertEquals(result3, App.checkErr(path2));
        assertEquals(result4, App.checkErr(path3));
        assertEquals(result5, App.checkErr(path4));
        assertEquals(result6, App.checkErr(path5));


    }

}