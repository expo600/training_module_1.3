package main.java.com.ryzhov_andrey.javacore.chapter_13;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //сначала убедитесь, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("использование: CopyFile откуда куда");
            return;
        }
        // копировать файл
        try {
            // попытаться открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        }catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода: " + e);
        }finally {
            try{
                if (fin != null) fin.close();
            }catch (IOException e2){
                System.out.println("Ошибка закрытия файла ввода");
            }try {
                if (fout != null) fout.close();

            }catch (IOException e2){
                System.out.println("Ошибка закрытия файла ввода");
            }
        }
    }
}
