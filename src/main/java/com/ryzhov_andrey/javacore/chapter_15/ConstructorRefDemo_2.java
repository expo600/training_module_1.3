package main.java.com.ryzhov_andrey.javacore.chapter_15;

// Продемонстрировать применение ссылки на
// конструктор обобщенного класса
// Теперь функциональный интерфейс МyFunc обобщенный
interface MyFunc_12<T> {
    MyClass_12<T> func(T n);
}

class MyClass_12<T> {
    private T val;

    MyClass_12(T v) { // Этот конструктор принимает один аргумент
        val = v;
    }

    MyClass_12() {   // А это конструктор по умолчанию
        val = null;
    }

    public T getVal() {
        return val;
    }
}

class ConstructorRefDemo_2 {
    public static void main(String[] args) {

        // создать ссылку на конструктор обобщенного класса МyClass<T>
        MyFunc_12<Integer> myClassCons = MyClass_12<Integer>::new;

        // создать экземпляр класса МyClass<T>
        // по данной ссылке на конструктор
        MyClass_12<Integer> mc = myClassCons.func(105);


        // воспользоваться только что созданным
        // экземпляром класса МyClass<T>
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
