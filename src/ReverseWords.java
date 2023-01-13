import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    @Test
    void reverseOneWord() {
        Assertions.assertEquals("apple", reverseWords("elppa"));
    }

    @Test
    void reverseText() {
        Assertions.assertEquals("This is an example!", reverseWords("sihT si na !elpmaxe"));
    }

    @Test
    void reverseOnlySpace() {
        Assertions.assertEquals("    ", reverseWords("    "));
    }

    public static String reverseWords(final String original)
    {
        if (original.matches("^\s+$")) {
            return original;
        }
        String[] words = original.split(" ");
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed += "" + words[i].charAt(j);
            }
            words[i] = reversed;
        }
        return Arrays.stream(words).collect(Collectors.joining(" "));
    }

}
