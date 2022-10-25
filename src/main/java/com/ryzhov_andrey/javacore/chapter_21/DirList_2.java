package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList_2 {
    public static void main(String[] args) {
        String dirName = "\\Soft";

// создать фильтр, возвращающий логическое значение true, для доступных для записи файлов
        DirectoryStream.Filter<Path> now = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };

        // получить и использовать поток ввода из каталога только доступных для записи файлов
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName), now)) {
            System.out.println("Каталог " + dirName);

            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("< DIR >");
                else
                    System.out.println("       ");
                System.out.print(entry.getName(1));
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