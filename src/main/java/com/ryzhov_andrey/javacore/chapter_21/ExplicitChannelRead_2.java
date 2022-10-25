package main.java.com.ryzhov_andrey.javacore.chapter_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelRead_2 {
    public static void main(String[] args) {
        int count;

        // здесь канал открывается по пути, возвращаемым методом Path.get()
        // в виде объекта Path. Переменная filePath больше не нужна.
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))) {

            //выделять память под буфер
            ByteBuffer mBuffer = ByteBuffer.allocate(128);
            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuffer);

                // прекратить чтение при достижении конца файла
                if (count != -1) {

                    // подготовить буфер для чтения из него данных
                    mBuffer.rewind();

                    // читать байты данных из буфера и выводить их не экран, как символы
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuffer.get());

                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }

    }
}
