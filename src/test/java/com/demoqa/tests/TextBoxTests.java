package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {


        registrationPage.openPage().executeBanner().
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