package main.java.com.ryzhov_andrey.javacore.chapter_10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessError {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessError("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessError e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
