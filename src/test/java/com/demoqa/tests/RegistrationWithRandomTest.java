package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.TestDataProperties.*;

public class RegistrationWithRandomTest extends BaseTest {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fakerFillFormTest() {


        registrationPage.openPage().executeBanner().
                setFirstName(firstNameAdd).
                setLastName(lastNameAdd).
                setUserEmail(eMailAdd).
                setGender(gengerAdd).
                setNumber(numberPhoneAdd).
                setBirthDate(monthAdd, yearAdd, dayAdd).
                setSubject(subjectAdd).
                setHobbies(hobbiesAdd).
                addPicture(picturesAdd).
                setAddress(addressAdd).
                setState(stateAdd).
                setCity(cityAdd).
                clickBottom();

        registrationPage.
                checkResult("Full Name", firstNameAdd + " " + lastNameAdd).
                checkResult("Email", eMailAdd).
                checkResult("Gender", gengerAdd).
                checkResult("Number phone", numberPhoneAdd).
                checkResult("BirthDay", monthAdd + " " + yearAdd + " " + dayAdd).
                checkResult("Subjects", subjectAdd).
                checkResult("Hobbies", hobbiesAdd).
                checkResult("Pictures", picturesAdd).
                checkResult("Address", addressAdd).
                checkResult("State and City", stateAdd + " " + cityAdd);
    }

}