package main.java.com.ryzhov_andrey.javacore.chapter_29;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo_8 {
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

        // получить итератор для потока данных
        Iterator<String> itr = stream.iterator();

        // перебррать элементы в потоке данных
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
