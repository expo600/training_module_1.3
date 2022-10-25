package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo_1 {
    public static void main(String[] args) {

        // создать списочный массив значений типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(7);
        myList.add(5);
        System.out.println("Исходный список: " + myList);

        // получить поток списочного элемента массива
        Stream<Integer> myStream = myList.stream();

        // получить мин и мах значение, вызвав методы min(), max(), isPresent() и get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Минимальное значение: " + minVal.get());

        // нужен новый поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("Максимальное значение: " + maxVal.get());

        // отсортировать поток данных методом sorted()
        Stream<Integer> sortedStream = myList.stream()
                .sorted();
        // отобразить отсортированый поток данных вызвав метод forEach()
        System.out.print("Отсортированный поток данных: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // вывести только четные целостные значения, вызвав метод filter()
        Stream<Integer> oddVals = myList.stream()
                .sorted()
                .filter(n -> (n % 2) == 1);
        System.out.print("Четные значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // вывести только те четные значения, которые больше 5
        // обратите внимание на конвейеризацию обеих операций фильтрации
        oddVals = myList.stream()
                .filter(n -> (n % 2) == 1)
                .filter(n -> (n > 5));
        System.out.print("Нечетные значения больше 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
