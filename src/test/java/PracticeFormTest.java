import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Petrov");
        $("#userEmail").setValue("test@test.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--013").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#currentAddress").setValue("Moscow, Russia");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Gurgaon").pressEnter();
        $("#submit").click();

        $x("//td[contains(text(),'Student Name')]/../td[2]").shouldHave(text("Test Petrov"));
        $x("//td[contains(text(),'Student Email')]/../td[2]").shouldHave(text("test@test.com"));
        $x("//td[contains(text(),'Gender')]/../td[2]").shouldHave(text("Male"));
        $x("//td[contains(text(),'Mobile')]/../td[2]").shouldHave(text("1234567890"));
        $x("//td[contains(text(),'Date of Birth')]/../td[2]").shouldHave(text("13 April,1991"));
        $x("//td[contains(text(),'Subjects')]/../td[2]").shouldHave(text("English"));
        $x("//td[contains(text(),'Hobbies')]/../td[2]").shouldHave(text("Reading, Music"));
        $x("//td[contains(text(),'Address')]/../td[2]").shouldHave(text("Moscow, Russia"));
        $x("//td[contains(text(),'State and City')]/../td[2]").shouldHave(text("NCR Gurgaon"));
    }
}


