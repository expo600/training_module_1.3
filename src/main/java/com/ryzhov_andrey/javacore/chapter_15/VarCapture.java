package main.java.com.ryzhov_andrey.javacore.chapter_15;

interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        // локальная переменная, кот может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            // такое поведение переменной num допустимо, поскольку она не видоизменяется
            int v = num +n;
            // эта строка приведет к ошибке, т.к.предпринимается попытка видоизменить
            // значение переменной num
            //  num++;
            return v;
        };
        // эта строка приведет к ошибке, т.к. в ней нарушается действительно завершенное
        // состояние переменной num
        //  num = 9;
    }
}
