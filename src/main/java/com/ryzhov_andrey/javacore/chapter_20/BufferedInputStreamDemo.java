package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This is a copyright mark &copy; " + ",  &copy - not.\n ";
        byte buff[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        int c;
        boolean marked = false;

        //использовать опреатор try  с ресурсами для управления файлами
        try (BufferedInputStream f = new BufferedInputStream(in)) {
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
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else
                            System.out.print((char) c);
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}

