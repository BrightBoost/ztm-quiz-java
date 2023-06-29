package interfaces_and_abstract_classes.q8;

public class Question8 {
    
}

// Answer 1
interface A {
    default void method();
}

// Answer 2
interface A {
    void method() {
        System.out.println("Default method");
    }
}

// Answer 3
interface A {
    default void method() {
        System.out.println("Default method");
    }
}

// Answer 4
interface A {
    public void method() {
        System.out.println("Default method");
    }
}