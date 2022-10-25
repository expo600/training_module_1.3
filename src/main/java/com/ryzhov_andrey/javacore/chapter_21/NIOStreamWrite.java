package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {

        // открыть файл и получить связанный с ним поток вывода
        try (OutputStream fOut = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {

            // вывести в поток данное кол-во байтов
            for (int i = 0; i < 26; i++)
                fOut.write((byte) ('A' + i));

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
