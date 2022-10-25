package main.java.com.ryzhov_andrey.javacore.chapter_15;

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo_2 {
    public static void main(String[] args) {

        // это лямбда-выр разворачивает строку
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("begin обращается на " + reverse.func("begin"));
        System.out.println("stop обращается на " + reverse.func("stop"));
    }
}
