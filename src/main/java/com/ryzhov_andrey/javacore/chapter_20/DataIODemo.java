package main.java.com.ryzhov_andrey.javacore.chapter_20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        //сначала вывести данные в файл
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.txt"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода.");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        // Теперь ввести данные из файла
        try (DataInputStream din = new DataInputStream(new FileInputStream("test.txt"))) {
           double d = din.readDouble();
           int i = din.readInt();
           boolean b = din.readBoolean();

            System.out.println("Полученные значения: " + d + " " + i + " " + b);
        }catch (FileNotFoundException e){
            System.out.println("Нельзя открыть файл вывода.");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
