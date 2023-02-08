public class TenMinutesWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int countN = 0, countW = 0, countS = 0, countE = 0;
        for (char c : walk) {
            if (c == 'n') countN++;
            if (c == 'w') countW++;
            if (c == 's') countS++;
            if (c == 'e') countE++;
        }
        System.out.println(countN);
        System.out.println(countS);
        return countN == countS && countW == countE;
    }
}