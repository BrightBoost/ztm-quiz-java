package functional_programming.q6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Youssef", "Nabeel", "Scott", "David", "Aya");
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
    }
}
