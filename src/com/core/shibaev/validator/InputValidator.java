package com.core.shibaev.validator;

public class InputValidator {
    public boolean isName(String name)
    {
        boolean result = true;
        if(name.length() == 0 || name.length() > 15)
        {
            result = false;
        }
        return result;
    }
}
