public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("!")) {
                continue;
            }
            String first = words[i].substring(0, 1);
            String rest = words[i].substring(1, words[i].length());
            words[i] = rest + first + "ay";
        }
        return String.join(" ", words);
    }
}
