package working_with_dates_and_times.q8;

import java.time.ZoneId;

public class Question8 {
    public static void main(String[] args) {

        // Answer 1
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }

        // Answer 2
        String zoneId2 = "Europe/Amsterdam";
        System.out.println(zoneId2);

        // Answer 3
        System.out.println(identifyThisZoneId());

        // Answer 4
        for (String zoneId : getAllZoneIds()) {
            System.out.println(zoneId);
        }
    }
}

// don't show this!
public static String identifyThisZoneId() {
    return "";
}

public static String[] getAllZoneIds() {
    return new String[2];
}