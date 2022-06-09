public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("katas","steak"));
    }

    public static boolean scramble(String str1, String str2) {
        String[] str2Chars = str2.split("");
        for (String str2Char : str2Chars) {
            int index = str1.indexOf(str2Char);
            if (index < 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder(str1);
            sb.setCharAt(index, '-');
            str1 = sb.toString();
        }
        return true;
    }
}
