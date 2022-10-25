package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;

public class StreamDemo_3 {
    public static void main(String[] args) {

        // создать список объектов типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(25.0);
        myList.add(16.0);
        myList.add(9.0);
        myList.add(36.0);
        myList.add(49.0);
        myList.add(81.0);

        double productOfSqrRoots = myList.parallelStream()
                .reduce(1.0,
                        (a, b) -> a * Math.sqrt(b),
                        (a, b) -> a * b);
        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}
