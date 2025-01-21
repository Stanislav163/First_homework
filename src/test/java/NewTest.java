import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NewTest {

    @Test
    void FirstTest() {

        System.out.println("###    firstTest()");
        Assertions.assertTrue(3>2);
    }


    @Test
    void SecondTest() {
        System.out.println("###    SecondTest()");
        Assertions.assertTrue(3>2);
    }


    @Test
    void thirdTest() {
        System.out.println("###    thirdTest()");
        Assertions.assertTrue(3>2);
    }
}
