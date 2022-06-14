import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    public static void main(String[] args) {
        System.out.println(formatDuration(86892));
    }

    public static String formatDuration(int seconds) {

        if (seconds == 0) return "now";

        List<Integer> value = new ArrayList<>();
        List<String> term = new ArrayList<>();

        if (seconds >= 31536000) {
            int year = seconds / 31536000;
            value.add(year);
            term.add( year == 1 ? "year" : "years" );
            seconds -= year * 31536000;
        }
        if (seconds >= 86400) {
            int day = seconds / 86400;
            value.add(day);
            term.add( day == 1 ? "day" : "days" );
            seconds -= day * 86400;
        }
        if (seconds >= 3600) {
            int hour = seconds / 3600;
            value.add(hour);
            term.add( hour == 1 ? "hour" : "hours" );
            seconds -= hour * 3600;
        }
        if (seconds >= 60) {
            int minute = seconds / 60;
            value.add(minute);
            term.add( minute == 1 ? "minute" : "minutes" );
            seconds -= minute * 60;
        }
        if (seconds > 0) {
            value.add(seconds);
            term.add( seconds == 1 ? "second" : "seconds" );
        }

        String formattedString = "";
        int counter = value.size();

        System.out.println(value);
        System.out.println(term);

        for (int i = 0; i < value.size(); i++) {
            if (counter > 2) {
                formattedString += value.get(i) + " " + term.get(i) + ", ";
                counter--;
                continue;
            }
            if (counter == 2) {
                formattedString += value.get(i) + " " + term.get(i) + " and " + value.get(i+1) + " " + term.get(i+1);
                break;
            }
            if (counter == 1) {
                formattedString += value.get(i) + " " + term.get(i);
                break;
            }
        }

        return formattedString;
    }
}
