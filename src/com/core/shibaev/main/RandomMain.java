package com.core.shibaev.main;

import com.core.shibaev.console.ConsoleService;
import com.core.shibaev.service.CommandLineService;

import java.io.IOException;

public class RandomMain {
    public static void main(String[] args) {
        CommandLineService commandLineService = new CommandLineService();
        int number = 0;
        int[] numbers;
        String inputText;
        try {
            inputText = ConsoleService.consoleRead();
            number = Integer.parseInt(inputText);
        }
        catch (IOException | NumberFormatException e)
        {
            ConsoleService.printMessage("Wrong Input");
        }
        numbers = commandLineService.createRandomNumerics(number);
        ConsoleService.printNumeric(numbers);
    }
}
