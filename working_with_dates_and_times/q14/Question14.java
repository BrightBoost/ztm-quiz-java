package working_with_dates_and_times.q14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question14 {
    // Answer 1
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    String formattedDate = date.format(formatter);

    // Answer 2
    String date2 = LocalDate.now("yyyy/MM/dd");

    // Answer 3
    String date3 = LocalDate.parse("yyyy/MM/dd", new LocalDate());

    // Answer 4
    LocalDate date4 = LocalDate.now();
    DateTimeFormatter formatter4 = DateTimeFormatter.defaultPattern();
    String formattedDate4 = date4.format(formatter);
}
