import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PractiseFormTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
  @Test
    void fillFormTest() {

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");


        $("#firstName").setValue("Ivanov");
        $("#lastName").setValue("Petr");
        $("#userEmail").setValue("Petr@ivanov.");
        $("#gender-radio-2").parent().click();
        $("#userNumber").setValue("9993489999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--004").click();
        $("#userNumber").setValue("9993489999");
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("/img/picture.png");
        $("#currentAddress").setValue("St.Petersburg");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Petr Ivanov"));
        $(".modal-body").shouldHave(text("Petr@ivanov."));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("9993489999"));
        $(".modal-body").shouldHave(text("04 April,1991"));
        $(".modal-body").shouldHave(text("Sports"));
        $(".modal-body").shouldHave(text("Maths"));
        $(".modal-body").shouldHave(text("picture.png"));
        $(".modal-body").shouldHave(text("St.Petersburg"));
        $(".modal-body").shouldHave(text("NCR Delhi"));
        $("#closeLargeModal").click();


    }
}

