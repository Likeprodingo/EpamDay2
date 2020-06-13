package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.service.CalendarService;

import java.util.Calendar;

public class DeadLineMain {
    public static void main(String[] args) {
        CalendarService calendarService = new CalendarService();
        try {
            Calendar calendar = calendarService.calculateDeadLine(args[0]);
            ConsoleService.printDate(calendar,args[2]);
        }
        catch (CustomExeption |IndexOutOfBoundsException e)
        {
            ConsoleService.printMessage("Wrong input");
        }
    }
}
