package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.*;

public class CopyFile_1 {
    public static void main(String[] args) throws IOException {
        int i;
        // сначала убедимся, что заданы оба файла
        if (args.length != 2) {
            System.out.println("использование : CopyFile_1 откуда куда");
            return;
        }
        // открыть оба файла и управлять ими в операторе try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
