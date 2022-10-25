package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo_2 {
    public static void main(String[] args) {

        // создать список объектов типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(24);
        myList.add(13);
        myList.add(8);
        myList.add(27);
        myList.add(5);
        myList.add(19);

        // два способа получения результата перемножения целочисленных элементов списка myList
        // с помощью метода reduce()
        Optional<Integer> productObj = myList.stream()
                .reduce((a, b) -> a * b);
        if (productObj.isPresent())
            System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + product);

        // произведение четных целостных значений в виде значения типа int
        int eventProduct = myList.stream()
                                 .reduce(1, (a, b) -> {
                    if (b % 2 == 0) return a * b;
                    else return a;
                });
        System.out.println("Произведение четных целостных значений: "+eventProduct);
    }
}
