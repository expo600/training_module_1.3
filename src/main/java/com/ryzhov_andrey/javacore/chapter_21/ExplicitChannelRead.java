package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;

        // сначала получить путь к файлу
        try {
            filePath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Past error" + e);
            return;
        }

        //затем получить канал к этому файлу в блоке try  с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {

            //выделить память под буфер
            ByteBuffer mBuffer = ByteBuffer.allocate(128);
            do {
                //читать байты из файла в буфер
                count = fChan.read(mBuffer);

                // прекратить чтение при достижении конца файла
                if (count != -1) {

                    // подготовить буфер к чтению из него данных
                    mBuffer.rewind();

                    //читать байты данных из буфера и выводить их на экран, как символы
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuffer.get());
                }

            } while (count != -1);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
