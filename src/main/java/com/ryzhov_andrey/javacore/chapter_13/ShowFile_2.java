package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.*;

public class ShowFile_2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        // сначала убедимся, что имя файла указано
        if (args.length != 1) {
            System.out.println("использование : ShowFile_2 имя_файла");
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
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода: " + e);
        } finally {
            // закрыть файл в любом случае
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}

