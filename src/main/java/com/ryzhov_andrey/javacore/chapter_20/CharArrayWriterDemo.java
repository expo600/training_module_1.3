package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This data should be output to an array";
        char buff[] = new char[s.length()];

        s.getChars(0,s.length(),buff,0);

        try{
           f.write(buff);
        }catch (IOException e){
            System.out.println("Ошибка записи в буфер.");
            return;
        }
        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        char c[]=f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("\nВ поток выхода типа FileWriter()");

        // использовать оператор try с ресурсами для управления потоком ввода-вывода в файл
        try (FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
            System.out.println(f.toString());
        }
    }
}
