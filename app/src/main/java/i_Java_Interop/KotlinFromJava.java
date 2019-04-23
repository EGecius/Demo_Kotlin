package i_Java_Interop;

public class KotlinFromJava {

    void demoKotlinFromJava() {

        new Foo(1);
        new Foo(1, 2);

        new Foo(1).f("a");
        new Foo(1).f("a", 1);
        new Foo(1).f("a", 1, "c");
        new Foo(1).f("a", 1, "c");


    }
}
