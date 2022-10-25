package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'stop' для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i]= br.readLine();
            if (str[i].equals("stop"))
                break;
        }
        System.out.println("\nСодержимое вашего файла");
        // вывести текст строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);

        }
    }
}
