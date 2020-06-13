package com.core.shibaev.service;

import com.core.shibaev.exeption.CustomExeption;
import com.core.shibaev.validator.InputValidator;

import java.util.Random;

public class CommandLineService {
    private final String EXAMPLE_STRING = "123";
    public String helloMethod(String name) throws CustomExeption
    {
        InputValidator inputValidator = new InputValidator();
        if(!inputValidator.isName(name))
        {
            throw new CustomExeption("Wrong Input");
        }
        return name;

    }
    public int[] createRandomNumerics(int lenght)
    {
       int []mas =  new int[lenght];
       for (int i = 0; i < lenght;i++)
       {
           mas[i] = (int) (Math.random()* 100);
       }
       return mas;
    }
    public boolean passWordCheck(String password) throws CustomExeption
    {
        if (password.equals(EXAMPLE_STRING))
        {
            return true;
        }
        else {
            throw new CustomExeption("Wrong Input");
        }
    }
    public int[] calculateArgs(String[] args) throws CustomExeption
    {
        int num;
        int sum = 0;
        int multiply = 1;
        if(args.length == 0 ){
            throw  new CustomExeption("Wrong Args");
        }
        for (String arg : args) {
            try {
                num = Integer.parseInt(arg);
                sum += num;
                multiply *= num;
            } catch (NumberFormatException e) {
                throw new CustomExeption("Wrong Args");
            }
        }
        return new int[]{sum,multiply};
    }
}
