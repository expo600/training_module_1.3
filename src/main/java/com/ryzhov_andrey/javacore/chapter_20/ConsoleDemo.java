package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        // получить ссылку на консоль
        console = System.console();

        // выйти из програмы, если консоль недоступна
        if (console == null)
            return;

        // прочитать строку и вывести ее
        str = console.readLine("Введите строку: ");
        console.printf("Введенная вами строка: %s\n",str);
    }
}
