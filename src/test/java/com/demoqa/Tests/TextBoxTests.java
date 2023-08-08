package com.demoqa.Tests;

import com.demoqa.Pages.RegistrationPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {


        registrationPage.openPage().
                setFirstName("Sergey").
                setLastName("Sergeev").
                setUserEmail("SerjoSergeev@gmail.com").
                setGender("Male").
                setNumber("8005553535").
                setBirthDate("08", "June",  "1996").
                setSubject("English").
                setHobbies("Sports").
                addPicture("multipass.jpg").
                setAddress("Tagil").
                setState("Uttar Pradesh").
                setCity("Agra").
                clickBottom();

            registrationPage.
                    checkResult("Serjo").
                    checkResult("Sergeev").
                    checkResult("SerjoSergeev@gmail.com").
                    checkResult("Male").
                    checkResult("Serjo").
                    checkResult("Sergeev").
                    checkResult("SerjoSergeev@gmail.com").
                    checkResult("Male").
                    checkResult("8005553535").
                    checkResult("08 June,1996").
                    checkResult("English").
                    checkResult("Sports").
                    checkResult("multipass.jpg").
                    checkResult("Tagil").
                    checkResult("Uttar Pradesh").
                    checkResult("Agra");
    }
}