package main.java.com.ryzhov_andrey.javacore.chapter_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail_7 {
    String name;
    String phone;
    String email;

    public NamePhoneEmail_7(String n, String p, String e) {
        this.name = n;
        this.phone = p;
        this.email = e;
    }
}

class NamePhone_7 {
    String name;
    String phone;

    public NamePhone_7(String n, String p) {
        this.name = n;
        this.phone = p;
    }
}

public class StreamDemo_7 {
    public static void main(String[] args) {

        // список имен, номеров тел и почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-666666", "larry@mail.com"));
        myList.add(new NamePhoneEmail("Garry", "555-444444", "garry@mail.com"));
        myList.add(new NamePhoneEmail("Marry", "555-333333", "marry@mail.com"));

        // отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone_7> namePhone = myList.stream().map(a -> new NamePhone_7(a.name, a.phone));

        //вызвать метод collect(), чтобы составить новый список имен и номеров
        List<NamePhone_7> npList = namePhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке List: ");
        for (NamePhone_7 e : npList)
            System.out.println(e.name + ": " + e.phone);
        System.out.println();

        // получить новое отображение имен и телефонов
        namePhone = myList.stream().map(a -> new NamePhone_7(a.name, a.phone));

        // а теперь создать множество типа Set, вызвав метод collect()
        Set<NamePhone_7> npSet = namePhone.collect(Collectors.toSet());

        System.out.println("Имена и номера телефонов в множестве типа Set: ");
        for (NamePhone_7 q : npSet)
            System.out.println(q.name + ": " + q.phone);

    }
}

