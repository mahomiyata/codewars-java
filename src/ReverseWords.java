import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return Stream.of(original.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
