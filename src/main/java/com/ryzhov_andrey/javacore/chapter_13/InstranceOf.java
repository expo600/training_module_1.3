package main.java.com.ryzhov_andrey.javacore.chapter_13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A{
    int k;
}

class D extends A{
    int k;
}

public class InstranceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a является экземпляром A");
        if (b instanceof B)
            System.out.println("b является экземпляром B");
        if (c instanceof C)
            System.out.println("c является экземпляром C");
        if (c instanceof A)
            System.out.println("c можно привести к типу A");
        if (a instanceof C)
            System.out.println("a можно привести к типу C");
        System.out.println();

        // сравнить с порожденными типами
        A ob;

        ob = d; // ссылка на объект d
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D)
            System.out.println("ob является экземпляром D");
        System.out.println();

        ob = c; // ссылка на объект c
        System.out.println("ob теперь ссылается на c");
        if (ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A)
            System.out.println("ob можно привести к типу A");
        System.out.println();

        // все объекты могутбыть приведены к типу Object
        if(a instanceof Object)
            System.out.println("a можно привести к типу Object");
        if(b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if(c instanceof Object)
            System.out.println("c можно привести к типу Object");
        if(d instanceof Object)
            System.out.println("d можно привести к типу Object");
    }
}
