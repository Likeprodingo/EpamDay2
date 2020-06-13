package com.core.shibaev.console;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleService {
    public static String consoleRead() throws IOException {
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        str = reader.readLine();
        return str;
    }
    public static  void printDate(Calendar cal, String name)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(cal));
        System.out.printf(" %s ",name);
    }

    public static void printArgs(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
    public static void printActionResult(int sum, int multiply)
    {
        System.out.printf("Sum: %s %n",sum);
        System.out.printf("Multiply: %s %n",multiply);
    }

    public static void printNumeric(int[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
    public static void printMessage(String message)
    {
        System.out.println(message);
    }
    public static void compareResult(boolean result)
    {
        System.out.println(result);
    }
    public static void printHello(String name) {
        System.out.printf("hello %s", name);
    }
}
