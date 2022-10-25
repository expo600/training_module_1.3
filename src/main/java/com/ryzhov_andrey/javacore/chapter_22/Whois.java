package main.java.com.ryzhov_andrey.javacore.chapter_22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) {
        int c;

        // создать сокетное соединение с сайтом через порт 43
        try (Socket socket = new Socket("whois.internic.net", 43)) {

            // получить потоки ввода-вывода
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            //сформировать строку запроса
            String str = (args.length == 0 ? "MHProfessional.com" : args[0] + "\n");

            // преобразовать строку в байты
            byte byteBuff[] = str.getBytes();

            // послать запрос
            outputStream.write(byteBuff);

            //
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}