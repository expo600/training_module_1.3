package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = " Now is the time for all good men\n " +
                " to come to the aid of their country\n " +
                " and рау their due taxes. ";
        byte buf[] = source.getBytes();

        // применяется оператор try с ресурсами для закрытия файлов
        try (FileOutputStream f1 = new FileOutputStream("C:\\Soft\\TesT\\test1.txt");
             FileOutputStream f2 = new FileOutputStream("C:\\Soft\\TesT\\test2.txt");
             FileOutputStream f3 = new FileOutputStream("C:\\Soft\\TesT\\test3.txt")) {

            // записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2)
                f1.write(buf[i]);

            // записать данные во второй файл
            f2.write(buf);

            // записать данные в третий файл
            f3.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");

        }
    }
}