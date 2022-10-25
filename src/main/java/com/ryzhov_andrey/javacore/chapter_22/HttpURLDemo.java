package main.java.com.ryzhov_andrey.javacore.chapter_22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.google.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        // вывести метод запроса
        System.out.println("Метод запроса: " + urlConnection.getRequestMethod());

        // вывести код ответа
        System.out.println("Код ответа: " + urlConnection.getResponseCode());

        // вывести ответное сообщение
        System.out.println("Ответное сообщение: " + urlConnection.getResponseMessage());

        // получить список полей и множество ключей из заголовка
        Map<String, List<String>> urlMap = urlConnection.getHeaderFields();
        Set<String> urlFields = urlMap.keySet();
        System.out.println("\nДалее следует заголовок: ");

        // вывести все ключи и значения из заголовка
        for (String k : urlFields) {
            System.out.println("Ключ: " + k + " Значение: " + urlMap.get(k));
        }

    }
}
