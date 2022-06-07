public class Order {

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {

        if (words.equals("") || words == null) {
            return "";
        }

        String[] wordsArr =  words.split(" ");
        String[] sorted = new String[wordsArr.length];

        for (int i = 0; i < wordsArr.length; i++) {
            for (String word : wordsArr) {
                if (word.contains(Integer.toString(i + 1))) {
                    sorted[i] = word;
                }
            }
        }
        return String.join(" ", sorted);
    }
}
