package com.demoqa.utils;

import com.github.javafaker.Faker;

import static com.demoqa.utils.TestDataProperties.faker;


public class RandomUtils {
    public static String months;
    public static String state;

    public static String getRandomFirstName() {

        return faker.name().firstName();
    }

    public static String getRandomLastName() {

        return faker.name().lastName();
    }

    public static String getRandomEmail() {

        return faker.internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {
                "Male", "Female", "Other"
        };
        return new Faker().options().option(genders);
    }

    public static String getRandomNumber() {

        return faker.phoneNumber().phoneNumber();
    }


    public static String getRandomMonth() {
        String[] randomMonth = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return faker.options().option(randomMonth);
    }

    public static String getRandomYear() {

        return faker.random().nextInt(1950, 2005).toString();
    }

    public static String getRandomDay(String months) {
        switch (months) {
            case "January":

            case "March":

            case "May":

            case "July":

            case "August":

            case "October":


            case "December": {
                String[] randomDay = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
                return faker.options().option(randomDay);
            }

            case "February": {
                String[] randomDay = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28"};
                return faker.options().option(randomDay);
            }

            case "April":

            case "June":

            case "September":

            case "November": {
                String[] randomDay = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
                return faker.options().option(randomDay);
            }
        }
        return null;
    }

    public static String getRandomSubject() {
        String[] subjects = {
                "Accounting", "Arts", "Biology",
                "Chemistry", "Civics", "Economics", "English",
                "Commerce", "Computer Science", "Physics",
                "Maths", "Hindi", "History", "Social Studies"
        };
        return faker.options().option(subjects);

    }

    public static String getRandomHobbies() {
        String[] hobbies = {
                "Sports", "Reading", "Music"
        };
        return faker.options().option(hobbies);

    }

    public static String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomState() {
        String[] states = {
                "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
        }


    public static String getRandomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return faker.options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city);
            }
        }
        return null;

    }




}
