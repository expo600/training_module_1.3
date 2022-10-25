package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.*;

public class ShowFile_3 {
    public static void main(String[] args) {
        int i;
        // сначала убедитесь, что имя файла указано
        if (args.length != 1) {
            System.out.println("использование ShowFile_3 имя_файла");
            return;
            // Ниже оператор try с ресурсами применяется
            // сначала для открытия, затем для автоматического
            // закрытия файла по завершении блока этого оператора
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        }
    }
}

