package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    public NamePhoneEmail(String n, String p, String e) {
        this.name = n;
        this.phone = p;
        this.email = e;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String n, String p) {
        this.name = n;
        this.phone = p;
    }
}

public class StreamDemo_5 {
    public static void main(String[] args) {

        // список имен, номеров тел и почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-666666", "larry@mail.com"));
        myList.add(new NamePhoneEmail("Garry", "555-444444", "garry@mail.com"));
        myList.add(new NamePhoneEmail("Marry", "555-333333", "marry@mail.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));
        System.out.println();

        // отобразить на новый поток данных только номера и телефоны
        Stream<NamePhone> namePhone = myList.stream().map(a -> new NamePhone(a.name, a.phone));
        System.out.println("Список имен и номеров телефонов: ");
        namePhone.forEach(a -> System.out.println(a.name + " " + a.phone));
    }
}
