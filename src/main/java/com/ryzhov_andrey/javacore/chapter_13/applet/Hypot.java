package main.java.com.ryzhov_andrey.javacore.chapter_13.applet;

// Воспользоваться статистическим импортом для доступа
// к встроенным в Java методам sqrt() и pow()
import static java.lang.Math.*;

// вычислить гипотенузу прямоугольного треугольника
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1,2) +pow(side2,2) );
        System.out.println("Призаданной длине сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
