package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String str = "This data should be output to an array";
        byte buf[] = str.getBytes();
        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }
        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte b[]= f.toByteArray();
        for (int i =0;i<b.length;i++)
            System.out.print((char) b[i]);
        System.out.println("\nВ поток вывода типа OutputStream()");

        // использовать оператор try с ресурсами для управления потоками ввода-вывода в файл
        try (FileOutputStream f2 = new FileOutputStream("C:\\Soft\\uploads\\test.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }
        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i = 0; i < 3; i++) f.write('X');
            System.out.println(f.toString());

    }
}
