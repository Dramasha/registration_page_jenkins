package demoQA;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Serjo");
        $("#lastName").setValue("Sergeev");
        $("#userEmail").setValue("SerjoSergeev@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8005553535");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("June")).click();
        $(".react-datepicker__year-select").$(byText("1996")).click();
        $(".react-datepicker__month").$(byText("8")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("multipass.jpg");
        $("#currentAddress").setValue("Tagil");
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Agra")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Serjo"));
        $(".table-responsive").shouldHave(text("Sergeev"));
        $(".table-responsive").shouldHave(text("SerjoSergeev@gmail.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("8005553535"));
        $(".table-responsive").shouldHave(text("08 June,1996"));
        $(".table-responsive").shouldHave(text("English"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("multipass.jpg"));
        $(".table-responsive").shouldHave(text("Tagil"));
        $(".table-responsive").shouldHave(text("Uttar Pradesh"));
        $(".table-responsive").shouldHave(text("Agra"));
    }
}