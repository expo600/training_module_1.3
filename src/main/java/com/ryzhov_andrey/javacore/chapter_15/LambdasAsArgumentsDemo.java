package main.java.com.ryzhov_andrey.javacore.chapter_15;

import java.util.Locale;

interface StringFunc_2 {
    String func(String n);
}

public class LambdasAsArgumentsDemo {

    // Первый параметр этого метода имеет тип функционального интерфейса.
    // Значит ему можно передать ссылку на любой экземпляр этого интерфейса,
    // включая экземпляр создаваемый в лямбда-выр.
    // Второй параметр обозначает обрабатываемую символьную строку.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффуктивность Java.";
        String outStr;

        System.out.println("Это исходная строка :" + inStr);

        // Простое лямбда-выр, преобразующее в верхний регистр букв все символы обрабатываемой строки,
        // передаваемой методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        // Здесь передается блочное лямбда-выр, удаляющее пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        // Конечно можно передать и экземпляр интерфейса StringFunc_2, созданный в предыдущем
        // лямбда-выр. Например, после следующего объявления ссылка reverse делается на
        // экземпляр интерфейса StringFunc_2.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // А теперь ссылку reverse можно передать в кач-ве первого параметра методу stringOp()
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}

