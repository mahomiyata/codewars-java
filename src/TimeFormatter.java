public class TimeFormatter {

    public static void main(String[] args) {
        System.out.println(3600 * 24);
        System.out.println(3600 * 24 * 365);
        System.out.println(formatDuration(62));
    }

    public static String formatDuration(int seconds) {

        if (seconds == 0) return "now";

        int year = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;

        if (seconds >= 31536000) {
            year = seconds / 31536000;
            seconds -= year * 31536000;
        }
        if (seconds >= 86400) {
            day = seconds / 86400;
            seconds -= day * 86400;
        }
        if (seconds >= 3600) {
            hour = seconds / 3600;
            seconds -= hour * 3600;
        }
        if (seconds >= 60) {
            minute = seconds / 60;
            seconds -= minute * 60;
        }
        String formattedString = "";
        if (hour > 0) {
            formattedString += hour == 1 ? hour + " hour" : hour + " hours";
        }
        if (minute > 0) {
            formattedString += hour > 0 && minute > 0 && seconds > 0 ? ", " : "";
            formattedString += hour > 0 && minute > 0 && !(seconds > 0) ? " and " : "";
            formattedString += minute == 1 ? minute + " minute" : minute + " minutes";
        }
        if (seconds > 0) {
            formattedString += minute > 0 && seconds > 0 ? " and " : "";
            formattedString += seconds == 1 ? seconds + " second" : seconds + " seconds";
        }
        return formattedString;
    }
}
