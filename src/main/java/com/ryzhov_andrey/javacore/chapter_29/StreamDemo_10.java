package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_10 {
    public static void main(String[] args) {

        // создать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Betta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Xi");
        myList.add("Omega");

        // получить поток данных для списочного массива
        Stream<String> stream = myList.stream();

        // получить итератор-разделитель для потока данных
        Spliterator<String> spliterator1 = stream.spliterator();

        // а теперь разделить первый итератор
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // использовать сначала spliterator2, если нельзя разделить - spliterator1
        if (spliterator2 != null)
            System.out.println("Результат выводимый итератором spliterator2: ");
        spliterator2.forEachRemaining(a -> System.out.println(a));
        System.out.println();

        // а теперь воспользоваться итератором spliterator1
        System.out.println("Результат выводимый итератором spliterator1: ");
        spliterator1.forEachRemaining(a -> System.out.println(a));


    }
}
