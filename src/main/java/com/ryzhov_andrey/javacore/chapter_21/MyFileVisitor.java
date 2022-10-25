package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// создать спец версию класса SimpleFileVisitor, в которой переопределяется метод visitFile()
 class MyFileVisitor extends SimpleFileVisitor<Path> {
     @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)
            throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String[] args) {
        String dirName = "\\Soft";
        System.out.println("Дерево каталога начинается с каталога: " + dirName + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}