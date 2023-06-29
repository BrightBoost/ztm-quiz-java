package interfaces_and_abstract_classes.q7;

public class Question7 {
    public static void main(String[] args) {
        Drawable drawable = new Canvas();
        drawable.draw();
        drawable.clear();
    }
}

interface Drawable {
    void draw();
    default void clear() {
        System.out.println("Clearing drawable");
    }
}

class Canvas implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing on canvas");
    }

    public void clear() {
        System.out.println("Cleaning canvas");
    }
}