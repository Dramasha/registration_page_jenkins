package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static com.demoqa.utils.RandomUtils.*;

public class TestDataProperties {

    static Faker faker = new Faker(new Locale("en"));

    public static String
            firstNameAdd = getRandomFirstName(),
            lastNameAdd = getRandomLastName(),
            eMailAdd = getRandomEmail(),
            gengerAdd = getRandomGender(),
            numberPhoneAdd = getRandomNumber(),
            monthAdd = getRandomMonth(),
            yearAdd = getRandomYear(),
            dayAdd = getRandomDay(months),
            subjectAdd = getRandomSubject(),
            hobbiesAdd = getRandomHobbies(),
            picturesAdd = "multipass.jpg",
            addressAdd = getRandomAddress(),
            stateAdd = getRandomState(),
            cityAdd = getRandomCity(state);







}
