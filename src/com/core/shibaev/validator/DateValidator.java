package com.core.shibaev.validator;

public class DateValidator {
    public boolean dateValidate(String day, String month, String year) {
        boolean result = true;
        int yearValue;
        int dayValue;
        int monthValue = -1;
        try {
            dayValue = Integer.parseInt(day);
            monthValue = Integer.parseInt(month);
            yearValue = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            result = false;
        }
        if(monthValue < 0 || monthValue > 11)
        {
            result = false;
        }
        return result;
    }

}
