public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("katas","steak"));
    }

    public static boolean scramble(String str1, String str2) {
        for (String str2Char : str2.split("")) {
            if (str1.contains(str2Char)) {
                return false;
            }
            str1 = str1.replaceFirst(str2Char, "");
        }
        return true;
    }
}
