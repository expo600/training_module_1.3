package main.java.com.ryzhov_andrey.javacore.chapter_10;

public class Exc2 {
    public static void main(String args[]) {

        try { //проконтролировать блок кода
            int d = 0;
           int a = 42 / d;
            System.out.println("Этo не будет выведено.");
        }catch(ArithmeticException е){ //перехватить ошибку
                                       // деления на нуль
                System.out.println("Деление на нуль");
            }
                System.out.println("После оператора catch");
        }
    }
