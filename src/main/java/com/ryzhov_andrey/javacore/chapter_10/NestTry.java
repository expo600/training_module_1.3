package main.java.com.ryzhov_andrey.javacore.chapter_10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try {//вложенный блок try
                if (a == 1)
                    a = a / (a - a);//деление на нуль
                if (a == 2) {
                    int c[] = {1};//здесь генерируется исключение в связи
                    c[42] = 99;   //с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива:" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль:" + e);
        }
    }
}
