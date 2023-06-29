package writing_and_using_methods_in_java.q8;

public class Question8 {
    public static String notify(String name, String message, int time) {
        String notification = "Hi " + name + "," + message + " Service will be restored in " + time + " minutes.";
        return notification;
    }
}
