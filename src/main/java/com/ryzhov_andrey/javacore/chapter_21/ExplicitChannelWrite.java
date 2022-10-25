package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        // получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("testt.txt"),
                                     StandardOpenOption.WRITE,
                                     StandardOpenOption.CREATE)) {

            // создать буфур
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);

            // записать некоторое кол-во байт в буфер
            for (int i = 0; i < 26; i++)
                byteBuffer.put((byte)( 'A' + i));

                // подготовить буфер к записи данных
                byteBuffer.rewind();

                // запись данных из буфера в выходной файл
                fileChannel.write(byteBuffer);

        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути " + e);
        }catch (IOException e){
            System.out.println("Ошибка ввода вывода " + e);
            System.exit(1);
        }
    }
}
