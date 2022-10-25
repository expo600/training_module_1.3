package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a copyright mark &copy; " + ",  &copy - not.\n ";
        char buff[] = new char[s.length()];
        s.getChars(0, s.length(), buff, 0);

        CharArrayReader in = new CharArrayReader(buff);
        int c;
        boolean marked = false;
        try (BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else
                            System.out.print((char) c);
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        } else
                            System.out.print((char) c);
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
