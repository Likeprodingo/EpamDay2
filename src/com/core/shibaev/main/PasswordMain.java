package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.service.CommandLineService;

import java.io.IOException;

public class PasswordMain {
    public static void main(String[] args) {
        CommandLineService commandLineService = new CommandLineService();
        boolean result;
        String password = "";
        try {
            password = ConsoleService.consoleRead();
            result = commandLineService.passWordCheck(password);
            ConsoleService.compareResult(result);
        }
        catch (IOException | CustomExeption e)
        {
            ConsoleService.printMessage("Wrong Input");
        }
    }
}
