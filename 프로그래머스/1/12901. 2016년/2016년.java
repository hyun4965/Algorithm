import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        LocalDate date = LocalDate.of(2016, a, b);

        int dayOfWeek = date.getDayOfWeek().getValue();

        return days[dayOfWeek % 7];
    }
}