package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String source = "Now is the time for all good men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes.";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f1 = new FileWriter("test1.txt");
             FileWriter f2 = new FileWriter("test2.txt");
             FileWriter f3 = new FileWriter("test3.txt")) {

            // вывести каждый второй символ в первый файл
            for (int i =0;i<buffer.length;i+=2){
                f1.write(buffer[i]);
            }
            // вывести все символы во второй файл
            f2.write(buffer);

            //вывести последнюю четверть символов в третий файл
            f3.write(buffer,buffer.length - buffer.length/4,buffer.length/4);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
