package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.service.CommandLineService;

import java.io.IOException;

public class HelloMain {

    public static void main(String[] args) {
        CommandLineService commandLineService = new CommandLineService();
        String name = "";
        try {
            name = ConsoleService.consoleRead();
            name = commandLineService.helloMethod(name);
        }
        catch (IOException | CustomExeption e)
        {
            ConsoleService.printMessage("Wrong Input");
        }

        ConsoleService.printHello(name);
    }
}
