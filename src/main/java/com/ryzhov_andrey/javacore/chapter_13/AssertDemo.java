package main.java.com.ryzhov_andrey.javacore.chapter_13;

public class AssertDemo {
    static int val = 3;

    // возвратить целостное значение
    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            assert n > 0; // не поддтвердится если n==0
            System.out.println("n равно " + n);

        }
    }
}
