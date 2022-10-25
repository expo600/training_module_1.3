package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_4 {
    public static void main(String[] args) {

        // создать список объектов типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(25.0);
        myList.add(16.0);
        myList.add(9.0);
        myList.add(36.0);
        myList.add(49.0);
        myList.add(81.0);

        // отобразить крадратные корни элементов из списка mylist на новый поток данных
        Stream<Double> sqrtRootStm = myList.stream().map(a -> Math.sqrt(a));

        // получить произведение квадратных корней
        double productOfSqrRoots = sqrtRootStm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}
