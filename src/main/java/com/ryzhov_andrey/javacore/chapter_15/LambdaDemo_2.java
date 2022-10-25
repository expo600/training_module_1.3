package main.java.com.ryzhov_andrey.javacore.chapter_15;

interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo_2 {
    public static void main(String[] args) {

        // лямбда-выр проверяющее является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10))
            System.out.println("Число 10 четное");
        if (!isEven.test(9))
            System.out.println("Число 9 нечетное");

        // лямбда-выр проверяющее число на отрицательность
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1))
            System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1))
            System.out.println("Число -1 отрицательное");
    }
}