package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.service.CommandLineService;

public class ArgsActionMain {
    public static void main(String[] args) {
        int[] actionResults;
        CommandLineService commandLineService   = new CommandLineService();
        try {
            actionResults = commandLineService.calculateArgs(args);
            ConsoleService.printActionResult(actionResults[0],actionResults[1]);
        }
        catch (CustomExeption e)
        {
            ConsoleService.printMessage("Wrong Args");
        }

    }
}
