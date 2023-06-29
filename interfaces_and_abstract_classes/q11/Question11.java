package interfaces_and_abstract_classes.q11;

public class Question11 {
    
}

interface A {
    default void method() {
        System.out.println("Interface A");
    }
}

interface b {
    default void method() {
        System.out.println("Interface B");
    }
}

class C implements A, B {
    // implementation
}