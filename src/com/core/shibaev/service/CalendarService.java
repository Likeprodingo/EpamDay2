package com.core.shibaev.service;

import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.validator.DateValidator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarService {
    public StringBuffer birthdayDate(String[] args) throws CustomExeption {
        DateValidator dateValidator = new DateValidator();
        StringBuffer message = new StringBuffer("");
        try {
            if (dateValidator.dateValidate(args[0], args[1], args[2])) {
                Calendar calendar = new GregorianCalendar(
                        Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]),
                        Integer.parseInt(args[2])
                );
                Calendar currentDate = Calendar.getInstance();
                message.append("Your birthday was in: ");
                message.append(calendar.get(Calendar.DAY_OF_WEEK));
                message.append(" day of week");
                if (currentDate.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)
                        && currentDate.get(Calendar.MONTH) == calendar.get(Calendar.MONTH)) {
                    message.append("\nHappy Birthday");
                }
            }
            else {
                throw new CustomExeption("Wrong Input");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new CustomExeption("Wrong Input");
        }
        return message;
    }

    public Calendar calculateDeadLine(String number) throws CustomExeption {
        int time;
        try {
            time = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new CustomExeption("Wrong Input");
        }
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, time);
        return cal;
    }
}
