package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.TestDataProperties.*;
import static io.qameta.allure.Allure.step;

public class RegistrationWithRandomTest extends BaseTest {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("remote")
    void fakerFillFormTest() {
        step("Отрытие страницы", () -> {
        registrationPage.openPage().executeBanner();
        });
        step("Заполнение формы регистрации", () -> {
                    registrationPage.setFirstName(firstNameAdd).
                            setLastName(lastNameAdd).
                            setUserEmail(eMailAdd).
                            setGender(gengerAdd).
                            setNumber(numberPhoneAdd).
                            setBirthDate(randomMonth, dayAdd, yearAdd).
                            setSubject(subjectAdd).
                            setHobbies(hobbiesAdd).
                            addPicture(picturesAdd).
                            setAddress(addressAdd).
                            setState(state).
                            setCity(cityAdd).
                            clickBottom();
                });
        step("Проверка заполненных полей формы регистрации", () -> {
            registrationPage.
                    checkResult("Student Name", firstNameAdd + " " + lastNameAdd).
                    checkResult("Student Email", eMailAdd).
                    checkResult("Gender", gengerAdd).
                    checkResult("Mobile", numberPhoneAdd).
                    checkResult("Date of Birth", dayAdd + " " + randomMonth + "," + yearAdd).
                    checkResult("Subjects", subjectAdd).
                    checkResult("Hobbies", hobbiesAdd).
                    checkResult("Picture", picturesAdd).
                    checkResult("Address", addressAdd).
                    checkResult("State and City", state + " " + cityAdd);
        });
    }
}