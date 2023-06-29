package working_with_dates_and_times.q11;

import java.time.LocalDate;
import java.time.Period;

public class Question11 {
    public static void main(String[] args) {
        // Answer 1
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today - Period.ofYears(1);

        // Answer 2
        LocalDate oneYearAgo2 = LocalDate.of(Time.OneYearAgo);

        // Answer 3
        LocalDate oneYearAgo3 = new LocalDate(2022, 4, 24); //assuming this is one year ago

        // Answer 4
        LocalDate today4 = LocalDate.now();
        LocalDate oneYearAgo4 = today4.minus(Period.ofYears(1));
    }    
}


