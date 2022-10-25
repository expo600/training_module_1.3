package main.java.com.ryzhov_andrey.javacore.chapter_13;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом платформенно-ориентированного метода: " + ob.i);
        ob.test();   // вызвать платформо-ориентированный метод
        System.out.println("Содержимое переменной ob.i после вызова платформенно-ориентированного метода: " + ob.i);
    }
        // объявляем платформо-ориентированный метод
        public native void test();

       // загружаем библиотеку DLL, содержащую статистический метод
    static {
        System.loadLibrary("NativeDemo");
    }
}
