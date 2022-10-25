package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_9 {
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
        Spliterator<String> spliterator = stream.spliterator();

        // перебррать элементы в потоке данных
        while (spliterator.tryAdvance(a -> System.out.println(a))) ;

        //spliterator.forEachRemaining(a -> System.out.println(a));
    }
}
