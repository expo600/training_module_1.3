package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("C:\\Soft\\uploads\\1b9fc176-e071-4f2c-b740-d70e4c2e4595.456.jpg");
        p("имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " + f1.getParent());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(f1.isDirectory() ? "является директорией" : "не является директорией");
        p(f1.isFile() ? "является обычный файлом" : "может быть именованым каналом");
        p(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последнее изменение в фвйле: " + f1.lastModified());
        p("Размер: " + f1.length() + "байт");
    }
}
