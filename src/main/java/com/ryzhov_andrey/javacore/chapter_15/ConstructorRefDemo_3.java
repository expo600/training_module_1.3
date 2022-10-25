package main.java.com.ryzhov_andrey.javacore.chapter_15;

// Реализовать простую фабрику классов , исполь зуя ссылку на конструктор
interface MyFunc_10<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass_10<T> {
    private final T val;

    MyClass_10(T v) {            // Конструктор , принимающий один параметр
        val = v;
    }

    MyClass_10() {               // Конструктор по умолчанию . Этот конструктор в
        val = null;              // данной программе НЕ исполь зуется
    }

    T getVal() {
        return val;
    }
}


class MyClass2_10 {            // Простой необобщенный класс
    String str;

    MyClass2_10(String s) {   // Конструктор , принимающий один аргумент
        str = s;
    }


    MyClass2_10() {         // Конструктор по умолчанию . Этот конструктор в
        str = " ";          // данной программе НЕ исполь зуется
    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo_3 {
    // Фабричный метод для объектов разных классов .
    // У каждого класса должен быть свой конструктор ,
    // принимающий один параметр типа Т. А параметр R
    //обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc_10<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса МyClass_10 .
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFunc_10<MyClass_10<Double>, Double> myClassCons = MyClass_10::new;

        // создать экземпляр типа класса МyClass_10 , исполь зуя фабричный метод
        MyClass_10<Double> mc = myClassFactory(myClassCons, 100.1);
        // использовать только что созданный экземпляр класса МyClass_10
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса ,
        // используя метод JDYClassFactory ()
        MyFunc_10<MyClass2_10, String> myClassCons2 = MyClass2_10::new;

        // создать экземпляр класса МyClass2 , исполь зуя фабричный ме тод
        MyClass2_10 mc2 = myClassFactory(myClassCons2, " Лямбда ");
        // исполь зовать толь ко что созданный экземпляр класса МyClass_10
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
