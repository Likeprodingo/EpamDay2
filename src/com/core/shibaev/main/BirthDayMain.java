package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.service.CalendarService;

import java.io.BufferedReader;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthDayMain {


    public static void main(String[] args) {
        CalendarService calendarService = new CalendarService();
        try {
            ConsoleService.printMessage(calendarService.birthdayDate(args).toString());
        }
        catch (CustomExeption e)
        {
            ConsoleService.printMessage("Wrong input");
        }
    }
}
