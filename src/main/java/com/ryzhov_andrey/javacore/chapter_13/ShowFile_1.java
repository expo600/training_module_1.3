package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.*;

public class ShowFile_1 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // сначала убедимся, что имя файла указано
        if (args.length != 1) {
            System.out.println("использование : ShowFile_1 имя файла");
            return;
        }
        // Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }
        // Теперь файл открыт и готов к чтению.
        // Далее из него читаются символы до тех пор
        // пока не встретится признак конца файла.
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            // закрыть файл привыходе из блока try
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}