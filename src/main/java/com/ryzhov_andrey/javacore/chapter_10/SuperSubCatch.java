package main.java.com.ryzhov_andrey.javacore.chapter_10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (ArithmeticException e){
            System.out.println("Этот код вообще не достижим(был).");
        }catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception.");
        }
    }
}
