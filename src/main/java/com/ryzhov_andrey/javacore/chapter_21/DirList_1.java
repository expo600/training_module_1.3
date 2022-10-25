package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList_1 {
    public static void main(String[] args) {
        String dirName = "\\Soft";

        // получить и обработать поток ввода каталога в блоке оператора try
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName))) {

            System.out.println("Каталог " + dirName);

            // класс DirectoryStream использует интерфейс Iterable, поэтому для вывода содержимого каталога
            // можно организовать цикл for each
            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("< DIR >");
                else
                    System.out.print("       ");
                System.out.println(entry.getName(1));
            }
        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути " + e);
        }catch (NotDirectoryException e){
            System.out.println(dirName + " - не является каталогом");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
