package main.java.com.ryzhov_andrey.javacore.chapter_15;

// Функциональ ный интерфейс для обработки массива значений
// и возврата целочисленного результата
interface MyFunc_2<T> {
    int func(T[] vals, T v);
}

// в э том классе определяется метод countМatching( ), возвращающий
// количество элементов в массиве, равных указанному значению.
// Обратите вниыание на то, что метод countМatchinq() является
// обобщенным, тогда как класс МyArrayOps - необобщенным
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;
        return count;
    }
}

class GenericMethodRefDemo {
    // В качестве первого параметра этого метода указывается
    // функциональный интерфейс МyFunc_2 , а в качестве двух других
    // параметров - массив и значение , причем оба типа Т
    static <T> int myOp(MyFunc_2<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps ::<Integer>countMatching,vals,4 );
        System.out.println("Maccив vals содержит " + count + " числа 4") ;

        count = myOp(MyArrayOps ::<String>countMatching,strs,"Два");
        System.out.println("Массив strs содержит " + count + " числа два");
    }
}

