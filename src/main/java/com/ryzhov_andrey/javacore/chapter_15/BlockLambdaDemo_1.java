package main.java.com.ryzhov_andrey.javacore.chapter_15;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo_1 {
    public static void main(String[] args) {
        // это блочное лямбда-выр вычисляет
        // факториал целостного значения
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));

    }
}