package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo_6 {
    public static void main(String[] args) {

        // создать список объектов типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(25.3);
        myList.add(16.4);
        myList.add(9.7);
        myList.add(36.2);
        myList.add(49.8);
        myList.add(81.9);

        System.out.print("Исходное значение их списка myList: ");
        myList.stream().forEach(a -> System.out.print(a + " "));
        System.out.println();

        // отобразить максимально допустимый предел каждого значения из списка myList на поток данных типа IntStream
        IntStream cStm = myList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.print("Max допустимые пределы значений из списка myList: ");
        cStm.forEach(a -> System.out.print(a + " "));

    }
}