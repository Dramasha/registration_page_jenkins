package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String mmonth, String dday, String yyear) {
        $(".react-datepicker__month-select").$(byText(mmonth)).click();
        $(".react-datepicker__year-select").$(byText(yyear)).click();
        $(".react-datepicker__day--0" + dday).click();

    }

}