package main.java.com.ryzhov_andrey.javacore.chapter_15;

// В функциональном интерфейсе МyFunc_13 определяется метод ,
// возвращающий ссылку на класс МyClass
interface MyFunc_13 {
    MyClass_13 func(int n);
}

class MyClass_13 {
    private int val;

    MyClass_13(int v) {  // Этот конструктор принимает один аргумент
         val = v;
    }

    MyClass_13() {      // Этот конструктор по-умолчанию
        val = 0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса МyClass_1 .
        // Метод func() из интерфейса МyFunc_13 принимает аргумент ,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса МyClass_13 , а не к его конструктору по умолчанию
        MyFunc_13 myClassCons = MyClass_13::new;

        // создать экземпляр класса МyClass_1 по ссылке на его конструктор
        MyClass_13 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса МyClass_1
        System.out.println(" Значение val в объекте mc равно " + mc.getVal());

    }
}
