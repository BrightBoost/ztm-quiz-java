package exceptions.q10;

public class Question10 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
